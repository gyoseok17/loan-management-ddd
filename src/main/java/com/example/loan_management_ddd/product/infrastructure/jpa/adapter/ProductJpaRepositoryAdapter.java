package com.example.loan_management_ddd.product.infrastructure.jpa.adapter;

import com.example.loan_management_ddd.product.domain.repository.ProductRepository;
import com.example.loan_management_ddd.product.infrastructure.jpa.jpareopsitory.ProductJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ProductJpaRepositoryAdapter implements ProductRepository {

    private final ProductJpaRepository productJpaRepository;



}
