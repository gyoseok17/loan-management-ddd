package com.example.loan_management_ddd.product.presentation.controller;

import com.example.loan_management_ddd.product.application.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;


}
