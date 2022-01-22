package com.kelvin.customerservicerestfulapi.controller;

import com.kelvin.customerservicerestfulapi.dto.ApiResponse;
import com.kelvin.customerservicerestfulapi.dto.BillingDetailRequest;
import com.kelvin.customerservicerestfulapi.dto.CustomerRequest;
import com.kelvin.customerservicerestfulapi.service.BillingDetailService;
import com.kelvin.customerservicerestfulapi.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1")
public class CustomerController {
    private final CustomerService customerService;
    private final BillingDetailService billingDetailService;


    @PostMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public ApiResponse saveCustomer(@RequestBody CustomerRequest customerRequest){
        return customerService.save(customerRequest);
    }

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ApiResponse getAllCustomer(@RequestParam(defaultValue = "1") int page,
                                      @RequestParam(defaultValue = "10") int size){
        return customerService.findAll(page, size);
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ApiResponse getCustomer(@PathVariable Long id){
        return customerService.findById(id);
    }






}
