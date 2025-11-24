package com.example.loan_management_ddd.Intake.domain.service;

import com.example.loan_management_ddd.Intake.domain.vo.CreditRating;
import com.example.loan_management_ddd.Intake.infrastructure.creditratingapi.dto.CreditRatingApiRequest;

public interface CreditRatingApi {
    CreditRating getCreditRating(CreditRatingApiRequest req);

}
