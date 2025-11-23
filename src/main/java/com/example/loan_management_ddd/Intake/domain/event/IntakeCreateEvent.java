package com.example.loan_management_ddd.Intake.domain.event;

import com.example.loan_management_ddd.Intake.domain.vo.LoanLimit;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class IntakeCreateEvent extends IntakeDomainEvent {
    // 신청이 접수되면 발행되는 이벤트
    // 이후 사전심사 진행
    private final Long intakeId;
    private final LoanLimit loanLimit;

    public static IntakeCreateEvent of(Long intakeId, LoanLimit loanLimit) {
        return new IntakeCreateEvent(
                intakeId,
                loanLimit
        );
    }

}
