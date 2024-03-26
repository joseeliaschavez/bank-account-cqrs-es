/* (C) 2024 */
package com.rangerforce.bankaccount.api.commands;

import com.rangerforce.bankaccount.cqrs.commands.BaseCommand;

public class CloseAccountCommand extends BaseCommand {
    public CloseAccountCommand(String id) {
        super(id);
    }
}
