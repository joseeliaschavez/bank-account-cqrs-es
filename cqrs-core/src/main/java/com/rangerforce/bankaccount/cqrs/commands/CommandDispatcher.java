/* (C) 2024 */
package com.rangerforce.bankaccount.cqrs.commands;

public interface CommandDispatcher {
    <T extends BaseCommand> void register(Class<T> type, CommandHandlerMethod<T> handler);

    <T extends BaseCommand> void dispatch(T command);
}
