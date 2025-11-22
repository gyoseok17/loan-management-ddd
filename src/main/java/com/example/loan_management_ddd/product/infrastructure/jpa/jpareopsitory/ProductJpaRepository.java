package com.example.loan_management_ddd.product.infrastructure.jpa.jpareopsitory;

import com.example.loan_management_ddd.product.domain.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductJpaRepository extends JpaRepository<Product,Long> {
}
