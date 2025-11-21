package com.example.loan_management_ddd.user.infrastructure.jpa.adapter;

import com.example.loan_management_ddd.user.domain.repository.UserRepository;
import com.example.loan_management_ddd.user.infrastructure.jpa.jparepository.UserJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserJpaReposiroryAdapter implements UserRepository {

    private final UserJpaRepository userJpaRepository;



}
