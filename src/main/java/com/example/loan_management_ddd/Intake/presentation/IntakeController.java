package com.example.loan_management_ddd.Intake.presentation;

import com.example.loan_management_ddd.Intake.application.IntakeService;
import com.example.loan_management_ddd.Intake.presentation.dto.CreateIntakeRequest;
import com.example.loan_management_ddd.Intake.presentation.dto.GetLoanLimitRequest;
import com.example.loan_management_ddd.Intake.presentation.dto.GetLoanLimitResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@RequiredArgsConstructor
public class IntakeController {
    private final IntakeService intakeService;

    // 한도 조회
    @GetMapping
    public ResponseEntity<GetLoanLimitResponse> getLoanLimit(@RequestBody GetLoanLimitRequest req){
        return ResponseEntity.ok(intakeService.calculateLoanLimit(req));
    }

    // 대출 신청 요청. 한도 조회 후 신청 가능 조회 데이터는 req에 포함
    @PostMapping
    public ResponseEntity<Void> createIntake(@RequestBody CreateIntakeRequest req){
        intakeService.createIntake(req);
        return ResponseEntity.ok().build();
    }

}
