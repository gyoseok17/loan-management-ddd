package com.example.loan_management_ddd.Intake.domain.policy;

import com.example.loan_management_ddd.Intake.domain.vo.CreditRating;
import com.example.loan_management_ddd.Intake.domain.vo.IntakeContent;
import com.example.loan_management_ddd.Intake.domain.vo.LoanLimit;
import org.springframework.stereotype.Component;

@Component
public class ALoanPolicy implements IntakePolicy{
    @Override
    public void validateIntake(IntakeContent intakeContent) {
        // a상품의 신청서 가 맞는지 검증
    }

    @Override
    public LoanLimit calculateLoanLimit(CreditRating creditRating) {
        // 신용 등급에 따른 a상품의 한도
        return new LoanLimit();
    }
}
