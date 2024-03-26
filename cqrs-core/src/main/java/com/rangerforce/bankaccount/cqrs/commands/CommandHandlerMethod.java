/* (C) 2024 */
package com.rangerforce.bankaccount.cqrs.commands;

@FunctionalInterface
public interface CommandHandlerMethod<T extends BaseCommand> {
    void handle(T command);
}
