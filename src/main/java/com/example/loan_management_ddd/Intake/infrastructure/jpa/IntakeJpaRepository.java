package com.example.loan_management_ddd.Intake.infrastructure.jpa;

import com.example.loan_management_ddd.Intake.domain.entity.Intake;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IntakeJpaRepository extends JpaRepository<Intake, Integer> {
}
