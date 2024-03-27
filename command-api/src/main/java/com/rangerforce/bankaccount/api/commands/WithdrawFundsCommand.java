/* (C) 2024 */
package com.rangerforce.bankaccount.api.commands;

import com.rangerforce.bankaccount.cqrs.commands.BaseCommand;
import lombok.EqualsAndHashCode;
import lombok.Value;

@EqualsAndHashCode(callSuper = true)
@Value
public class WithdrawFundsCommand extends BaseCommand {
    double amount;
}
