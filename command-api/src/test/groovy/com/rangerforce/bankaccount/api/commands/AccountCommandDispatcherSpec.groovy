package com.rangerforce.bankaccount.api.commands

import com.rangerforce.bankaccount.common.dto.AccountType
import com.rangerforce.bankaccount.cqrs.commands.CommandHandlerMethod
import spock.lang.Specification

class AccountCommandDispatcherSpec extends Specification {
    def "should dispatch a command to the correct handler"() {
        given:
        def dispatcher = new AccountCommandDispatcher()
        def command = new OpenAccountCommand("John Doe", AccountType.CHECKING, 1000.0)
        def handler = Mock(CommandHandlerMethod)
        dispatcher.register(OpenAccountCommand.class, handler)

        when:
        dispatcher.dispatch(command)

        then:
        1 * handler.handle(command)
    }

    def "should throw an exception if no handler is registered"() {
        given:
        def dispatcher = new AccountCommandDispatcher()
        def command = new OpenAccountCommand("John Doe", AccountType.CHECKING, 1000.0)

        when:
        dispatcher.dispatch(command)

        then:
        CommandException e = thrown()
        e.message == "No handler registered for OpenAccountCommand"
    }

    def "should dispatch #command.class.simpleName to the correct handler"() {
        given:
        def handler = Mock(CommandHandlerMethod)
        def dispatcher = new AccountCommandDispatcher()
        dispatcher.register(command.class, handler)

        when:
        dispatcher.dispatch(command)

        then:
        1 * handler.handle(command)

        where:
        command << [
                new OpenAccountCommand("John Doe", AccountType.CHECKING, 1000.0),
                new CloseAccountCommand("ID-1234"),
                new DepositFundsCommand(1000.0),
                new WithdrawFundsCommand(500.0)
        ]
    }
}
