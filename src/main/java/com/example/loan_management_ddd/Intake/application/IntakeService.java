package com.example.loan_management_ddd.Intake.application;

import com.example.loan_management_ddd.Intake.domain.entity.Intake;
import com.example.loan_management_ddd.Intake.domain.event.IntakeCreateEvent;
import com.example.loan_management_ddd.Intake.domain.repository.IntakeRepository;
import com.example.loan_management_ddd.Intake.domain.service.IntakeDomainService;
import com.example.loan_management_ddd.Intake.domain.vo.LoanLimit;
import com.example.loan_management_ddd.Intake.presentation.dto.CreateIntakeRequest;
import com.example.loan_management_ddd.Intake.presentation.dto.GetLoanLimitRequest;
import com.example.loan_management_ddd.Intake.presentation.dto.GetLoanLimitResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class IntakeService {
    private final IntakeRepository intakeRepository;
    private final IntakeDomainService intakeDomainService;
    private final ApplicationEventPublisher publisher;

    // 대출 신청 생성
    @Transactional
    public void createIntake(CreateIntakeRequest req) {
        Intake newIntake = req.createEntity();

        // 맞는 신청서 인지 검증
        intakeDomainService.validateIntake(req.createContent());

        intakeRepository.save(newIntake);
        //이벤트 발행
        publisher.publishEvent(IntakeCreateEvent.of(req.createEntity().getId(), req.loanLimit()));

    }

    public GetLoanLimitResponse calculateLoanLimit(GetLoanLimitRequest req) {
        // 계산후
        LoanLimit loanLimit = intakeDomainService.calculateLoanLimit(req.apirequest());
        // 응답 데이터 반환
        return new GetLoanLimitResponse();
    }
}
