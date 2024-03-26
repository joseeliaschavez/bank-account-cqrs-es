/* (C) 2024 */
package com.rangerforce.bankaccount.api.commands;

import com.rangerforce.bankaccount.common.dto.AccountType;
import com.rangerforce.bankaccount.cqrs.commands.BaseCommand;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class OpenAccountCommand extends BaseCommand {
    private String accountHolder;
    private AccountType accountType;
    private double openingBalance;
}
