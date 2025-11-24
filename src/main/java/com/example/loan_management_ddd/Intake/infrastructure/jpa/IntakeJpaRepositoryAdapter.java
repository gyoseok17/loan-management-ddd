package com.example.loan_management_ddd.Intake.infrastructure.jpa;

import com.example.loan_management_ddd.Intake.domain.entity.Intake;
import com.example.loan_management_ddd.Intake.domain.repository.IntakeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class IntakeJpaRepositoryAdapter implements IntakeRepository {
    private final IntakeJpaRepository intakeJpaRepository;

    @Override
    public Intake save(Intake newIntake) {
        return intakeJpaRepository.save(newIntake);
    }
}
