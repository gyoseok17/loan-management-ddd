package com.example.loan_management_ddd.Intake.infrastructure.creditratingapi.dto;

import com.example.loan_management_ddd.product.domain.entity.LoanType;
import lombok.Getter;

@Getter
public class CreditRatingApiRequest {
    //신청전 상품 별 한도 조회
    private LoanType loanType;
}
