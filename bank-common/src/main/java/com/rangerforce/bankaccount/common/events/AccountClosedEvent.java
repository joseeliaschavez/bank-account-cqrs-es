/* (C) 2024 */
package com.rangerforce.bankaccount.common.events;

import com.rangerforce.bankaccount.cqrs.events.BaseEvent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
@SuperBuilder
public class AccountClosedEvent extends BaseEvent {}
