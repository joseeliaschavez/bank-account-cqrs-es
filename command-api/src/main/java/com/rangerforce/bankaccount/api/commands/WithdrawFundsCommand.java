package com.rangerforce.bankaccount.api.commands;

import com.rangerforce.bankaccount.cqrs.commands.BaseCommand;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class WithdrawFundsCommand extends BaseCommand {
    private double amount;
}
