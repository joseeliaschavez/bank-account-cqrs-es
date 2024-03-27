/* (C) 2024 */
package com.rangerforce.bankaccount.api.commands;

import com.rangerforce.bankaccount.common.dto.AccountType;
import com.rangerforce.bankaccount.cqrs.commands.BaseCommand;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Value;

@EqualsAndHashCode(callSuper = true)
@Value
public class OpenAccountCommand extends BaseCommand {
    String accountHolder;
    AccountType accountType;
    double openingBalance;
}
