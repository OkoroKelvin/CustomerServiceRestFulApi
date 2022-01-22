package com.kelvin.customerservicerestfulapi.service;

import com.kelvin.customerservicerestfulapi.dto.ApiResponse;
import com.kelvin.customerservicerestfulapi.dto.CustomerRequest;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

@Service
@Validated
public interface CustomerService {

    ApiResponse findAll(int page, int size);
    ApiResponse save(@Valid CustomerRequest customerRequest);
    ApiResponse findById(Long id);
}
