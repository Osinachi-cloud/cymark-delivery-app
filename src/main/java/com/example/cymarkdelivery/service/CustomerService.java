package com.example.cymarkdelivery.service;

import com.example.cymarkdelivery.DTOs.CustomerResponse;
import com.example.cymarkdelivery.model.Customer;

public interface CustomerService {
    Customer addCustomer(CustomerResponse customerResponse);
    Customer updateCustomer(long customerId, CustomerResponse customerResponse);
    Customer getCustomerById(long customerId);
    void deleteCustomer(long customerId);
}
