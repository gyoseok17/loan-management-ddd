package com.example.loan_management_ddd.Intake.presentation.dto;

import com.example.loan_management_ddd.Intake.infrastructure.creditratingapi.dto.CreditRatingApiRequest;

public class GetLoanLimitRequest {

    public CreditRatingApiRequest apirequest() {
        return new CreditRatingApiRequest();
    }
}
