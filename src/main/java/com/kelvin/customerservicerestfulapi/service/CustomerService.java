package com.kelvin.customerservicerestfulapi.service;

import com.kelvin.customerservicerestfulapi.dto.ApiResponse;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {

    ApiResponse findAll(int page, int size);
}
