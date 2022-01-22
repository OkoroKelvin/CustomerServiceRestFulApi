package com.kelvin.customerservicerestfulapi.repository;


import com.kelvin.customerservicerestfulapi.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
