package com.example.loan_management_ddd.Intake.domain.policy;

import com.example.loan_management_ddd.Intake.domain.vo.CreditRating;
import com.example.loan_management_ddd.Intake.domain.vo.IntakeContent;
import com.example.loan_management_ddd.Intake.domain.vo.LoanLimit;

public interface IntakePolicy {

    // 상품 별 신청서 검증
    void validateIntake(IntakeContent intakeContent);

    // 상품 별 한도 조회
    LoanLimit calculateLoanLimit(CreditRating creditRating);

}
