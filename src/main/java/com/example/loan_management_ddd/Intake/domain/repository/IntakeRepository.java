package com.example.loan_management_ddd.Intake.domain.repository;

import com.example.loan_management_ddd.Intake.domain.entity.Intake;

public interface IntakeRepository {
    Intake save(Intake newIntake);
}
