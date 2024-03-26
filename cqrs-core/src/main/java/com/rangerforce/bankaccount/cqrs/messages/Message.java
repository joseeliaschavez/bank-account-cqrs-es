/* (C) 2024 */
package com.rangerforce.bankaccount.cqrs.messages;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Message {
    private String id;
}
