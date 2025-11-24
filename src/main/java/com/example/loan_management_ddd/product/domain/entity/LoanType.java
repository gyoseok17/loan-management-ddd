package com.example.loan_management_ddd.product.domain.entity;

import lombok.Getter;

@Getter
public enum LoanType {

    ALOAN("A상품"),
    BLOAN("B상품"),
    CLOAN("C상품");

    private final String description;

    LoanType(String description) {
        this.description = description;
    }
}
