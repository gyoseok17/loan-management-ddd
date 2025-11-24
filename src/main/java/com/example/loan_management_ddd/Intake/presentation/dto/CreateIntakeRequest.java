package com.example.loan_management_ddd.Intake.presentation.dto;

import com.example.loan_management_ddd.Intake.domain.entity.Intake;
import com.example.loan_management_ddd.Intake.domain.vo.IntakeContent;
import com.example.loan_management_ddd.Intake.domain.vo.LoanLimit;

public record CreateIntakeRequest(
        LoanLimit loanLimit

) {
    public Intake createEntity(){
        return Intake.create();
    }

    public IntakeContent createContent(){
        return new IntakeContent();
    }
}
