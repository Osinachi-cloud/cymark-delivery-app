package com.example.cymarkdelivery.repository;

import com.example.cymarkdelivery.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
