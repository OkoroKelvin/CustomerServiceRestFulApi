package com.kelvin.customerservicerestfulapi.service;

import com.kelvin.customerservicerestfulapi.dto.ApiResponse;
import com.kelvin.customerservicerestfulapi.model.Customer;
import com.kelvin.customerservicerestfulapi.repository.CustomerRepository;
import com.kelvin.customerservicerestfulapi.util.exception.ApplicationException;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

    @Override
    public ApiResponse findAll(int page, int size) {
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setStatus("success");
        if(page < 1) throw new ApplicationException("Page cannot be negative or zero");
        Pageable pageable = PageRequest.of(page - 1, size);
        Page<Customer> customers = customerRepository.findAll(pageable);
        apiResponse.getData().put("customers", customers.getContent());
        apiResponse.getData().put("results", customers.getNumberOfElements());
        apiResponse.getData().put("TotalNumberOfCustomers", customers.getTotalElements());
        apiResponse.getData().put("pageNumber", customers.getNumber() + 1);
        apiResponse.getData().put("TotalPages", customers.getTotalPages());

        return apiResponse;
    }
}
