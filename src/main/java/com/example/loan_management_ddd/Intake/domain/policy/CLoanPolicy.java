package com.example.loan_management_ddd.Intake.domain.policy;

import com.example.loan_management_ddd.Intake.domain.vo.CreditRating;
import com.example.loan_management_ddd.Intake.domain.vo.IntakeContent;
import com.example.loan_management_ddd.Intake.domain.vo.LoanLimit;
import org.springframework.stereotype.Component;

@Component
public class CLoanPolicy implements IntakePolicy {
    @Override
    public void validateIntake(IntakeContent intakeContent) {

    }

    @Override
    public LoanLimit calculateLoanLimit(CreditRating creditRating) {
        return new LoanLimit();
    }
}
