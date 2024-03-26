/* (C) 2024 */
package com.rangerforce.bankaccount.cqrs.events;

import com.rangerforce.bankaccount.cqrs.messages.Message;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class BaseEvent extends Message {
    private int version;
}
