package com.example.loan_management_ddd.user.infrastructure.jpa.jparepository;

import com.example.loan_management_ddd.user.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepository extends JpaRepository<User, Long> {
}
