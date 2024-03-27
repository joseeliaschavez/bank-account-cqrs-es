/* (C) 2024 */
package com.rangerforce.bankaccount.api.commands;

import com.rangerforce.bankaccount.cqrs.commands.BaseCommand;
import com.rangerforce.bankaccount.cqrs.commands.CommandDispatcher;
import com.rangerforce.bankaccount.cqrs.commands.CommandHandlerMethod;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.springframework.stereotype.Service;

@Service
public class AccountCommandDispatcher implements CommandDispatcher {
    private final Map<Class<?>, CommandHandlerMethod<?>> routes = new HashMap<>();

    @Override
    public <T extends BaseCommand> void register(Class<T> type, CommandHandlerMethod<T> handler) {
        routes.put(type, handler);
    }

    @Override
    public <T extends BaseCommand> void dispatch(T command) {
        @SuppressWarnings("unchecked")
        CommandHandlerMethod<T> handler = (CommandHandlerMethod<T>) routes.get(command.getClass());
        if (Objects.isNull(handler)) {
            throw new CommandException("No handler registered for " + command.getClass().getSimpleName());
        }
        handler.handle(command);
    }
}
