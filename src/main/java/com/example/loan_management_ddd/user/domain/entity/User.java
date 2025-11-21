package com.example.loan_management_ddd.user.domain.entity;

import com.example.loan_management_ddd.user.domain.vo.Address;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "p_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String loginId;
    private String password;
    private String name;

    @Embedded
    private Address address; // VO 임베딩

    @Enumerated(EnumType.STRING)
    private Role role;
}
