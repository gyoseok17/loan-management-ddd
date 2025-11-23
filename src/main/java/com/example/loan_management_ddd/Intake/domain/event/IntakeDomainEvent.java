package com.example.loan_management_ddd.Intake.domain.event;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public abstract class IntakeDomainEvent {
    private final LocalDateTime occurredAt;

    public IntakeDomainEvent() {
        this.occurredAt = LocalDateTime.now();
    }
}
