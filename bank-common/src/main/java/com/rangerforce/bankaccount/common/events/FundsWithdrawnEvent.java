/* (C) 2024 */
package com.rangerforce.bankaccount.common.events;

import com.rangerforce.bankaccount.cqrs.events.BaseEvent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@SuperBuilder
public class FundsWithdrawnEvent extends BaseEvent {
    private double amount;
}
