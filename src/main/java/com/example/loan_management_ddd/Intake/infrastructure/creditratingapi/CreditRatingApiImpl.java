package com.example.loan_management_ddd.Intake.infrastructure.creditratingapi;

import com.example.loan_management_ddd.Intake.domain.service.CreditRatingApi;
import com.example.loan_management_ddd.Intake.domain.vo.CreditRating;
import com.example.loan_management_ddd.Intake.infrastructure.creditratingapi.dto.CreditRatingApiRequest;
import org.springframework.stereotype.Component;

@Component
public class CreditRatingApiImpl implements CreditRatingApi {
    @Override
    public CreditRating getCreditRating(CreditRatingApiRequest req) {
        return new CreditRating();
    }
}
