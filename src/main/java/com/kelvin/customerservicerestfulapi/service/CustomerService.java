package com.kelvin.customerservicerestfulapi.service;

import com.kelvin.customerservicerestfulapi.dto.ApiResponse;
import com.kelvin.customerservicerestfulapi.dto.CustomerRequest;
import org.springframework.stereotype.Service;

import javax.validation.Valid;

@Service
public interface CustomerService {

    ApiResponse findAll(int page, int size);
    ApiResponse save(@Valid CustomerRequest customerRequest);
    ApiResponse findById(Long id);
}
