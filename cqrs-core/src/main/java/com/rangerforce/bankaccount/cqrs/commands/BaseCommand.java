/* (C) 2024 */
package com.rangerforce.bankaccount.cqrs.commands;

import com.rangerforce.bankaccount.cqrs.messages.Message;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public abstract class BaseCommand extends Message {
    public BaseCommand(final String id) {
        super(id);
    }
}
