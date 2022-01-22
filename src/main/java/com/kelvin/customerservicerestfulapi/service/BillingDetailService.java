package com.kelvin.customerservicerestfulapi.service;

import com.kelvin.customerservicerestfulapi.dto.ApiResponse;
import com.kelvin.customerservicerestfulapi.dto.BillingDetailRequest;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

@Validated
@Service
public interface BillingDetailService {
    ApiResponse save(@Valid BillingDetailRequest billingDetailRequest);
    ApiResponse findByCustomerId(Long customerId);
}
