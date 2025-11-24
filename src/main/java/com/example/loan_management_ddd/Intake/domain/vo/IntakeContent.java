package com.example.loan_management_ddd.Intake.domain.vo;

import com.example.loan_management_ddd.product.domain.entity.LoanType;
import lombok.Getter;

@Getter
public class IntakeContent {
    // 신청서 검증 요청에 보낼 데이터
    private LoanType loanType;
}
