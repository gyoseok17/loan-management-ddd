package com.example.loan_management_ddd.user.presentation;

import com.example.loan_management_ddd.user.application.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

}
