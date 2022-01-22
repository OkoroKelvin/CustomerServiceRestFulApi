package com.kelvin.customerservicerestfulapi.repository;

import com.kelvin.customerservicerestfulapi.model.BillingDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BillingDetailRepository extends JpaRepository<BillingDetail, Long> {

    @Query("select b from BillingDetail b where b.customer.id = ?1")
    List<BillingDetail> findAllByCustomerId(Long customerId);
}
