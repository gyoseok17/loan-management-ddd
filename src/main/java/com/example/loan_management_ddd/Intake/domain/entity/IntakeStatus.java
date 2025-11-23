package com.example.loan_management_ddd.Intake.domain.entity;

import lombok.Getter;

@Getter
public enum IntakeStatus {
    DRAFT("임시저장"),
    SUBMITTED("신청접수"),

    PRE_REVIEWING("사전심사중"),
    REVIEW_PENDING("본심사대기"),
    REVIEWING("본심사중"),

    DOC_REQUESTED("서류보완요청"),

    APPROVAL_PENDING("승인대기"),
    APPROVED("승인완료"),
    CONDITIONAL_APPROVED("조건부승인"),

    EXECUTION_PENDING("실행대기"),
    EXECUTED("실행완료"),

    REJECTED("심사거절"),
    CANCELLED("신청취소");

    private final String description;

    IntakeStatus(String description) {
        this.description = description;
    }
}
