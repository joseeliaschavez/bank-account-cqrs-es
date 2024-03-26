/* (C) 2024 */
package com.rangerforce.bankaccount.api.commands;

public class CommandException extends RuntimeException {
    public CommandException(String message) {
        super(message);
    }
}
