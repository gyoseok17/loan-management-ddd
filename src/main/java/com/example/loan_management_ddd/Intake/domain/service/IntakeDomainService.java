package com.example.loan_management_ddd.Intake.domain.service;

import com.example.loan_management_ddd.Intake.domain.policy.ALoanPolicy;
import com.example.loan_management_ddd.Intake.domain.policy.BLoanPolicy;
import com.example.loan_management_ddd.Intake.domain.policy.CLoanPolicy;
import com.example.loan_management_ddd.Intake.domain.vo.CreditRating;
import com.example.loan_management_ddd.Intake.domain.vo.IntakeContent;
import com.example.loan_management_ddd.Intake.domain.vo.LoanLimit;
import com.example.loan_management_ddd.Intake.infrastructure.creditratingapi.dto.CreditRatingApiRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class IntakeDomainService {
    private final ALoanPolicy aloanPolicy;
    private final BLoanPolicy bLoanPolicy;
    private final CLoanPolicy cLoanPolicy;
    private final CreditRatingApi creditRatingApi;

    public void validateIntake(IntakeContent intakeContent) {
        switch (intakeContent.getLoanType()) {
            case ALOAN -> {
                aloanPolicy.validateIntake(intakeContent);
            }
            case BLOAN -> {
                bLoanPolicy.validateIntake(intakeContent);
            }
            case CLOAN -> {
                cLoanPolicy.validateIntake(intakeContent);
            }
        }

    }

    public LoanLimit calculateLoanLimit(CreditRatingApiRequest req) {
        CreditRating creditRating = creditRatingApi.getCreditRating(req);
        switch (req.getLoanType()) {
            case ALOAN -> {
                return aloanPolicy.calculateLoanLimit(creditRating);
            }
            case BLOAN -> {
                return bLoanPolicy.calculateLoanLimit(creditRating);
            }
            case CLOAN -> {
                return cLoanPolicy.calculateLoanLimit(creditRating);
            }
            default -> throw new IllegalArgumentException("없는 상품: " + req.getLoanType());
        }
    }

}
