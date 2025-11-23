package com.example.loan_management_ddd.Intake.domain.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "p_intake")
public class Intake {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String intakeNumber;
    private Long customerId;
    private String LoanType;      // 공통 모듈 쓸지

    private BigDecimal requestAmount;   // 요청 금액
    private int loanPeriod;             // 대출 기한. 개월 단위
    private IntakeStatus intakeStatus;  // 진행 상황

    private LocalDateTime createdAt;
    private LocalDateTime appliedAt;
    private LocalDateTime updatedAt;

    // 생성
    public static Intake create() {
        return new Intake();
    }

}