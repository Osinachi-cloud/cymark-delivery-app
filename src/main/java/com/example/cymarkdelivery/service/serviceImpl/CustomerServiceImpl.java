package com.example.cymarkdelivery.service.serviceImpl;

import com.example.cymarkdelivery.DTOs.CustomerResponse;
import com.example.cymarkdelivery.exceptions.CustomerNotFoundException;
import com.example.cymarkdelivery.model.Customer;
import com.example.cymarkdelivery.repository.CustomerRepository;
import com.example.cymarkdelivery.service.CustomerService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService{

    private final CustomerRepository customerRepository;


    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer addCustomer(CustomerResponse customerResponse) {
        Customer customer = new Customer();
        BeanUtils.copyProperties(customer, customerResponse);
        return customer;
    }

    @Override
    public Customer getCustomerById(long customerId) {
        Customer customer = customerRepository.findById(customerId)
                .orElseThrow(()-> new CustomerNotFoundException( customerId +" not found"));
        return customer;
    }

    @Override
    public Customer updateCustomer(long customerId, CustomerResponse customerResponse) {
        Customer  customer = getCustomerById(customerId);
        BeanUtils.copyProperties(customer, customerResponse);
        return customer;
    }



    @Override
    public void deleteCustomer(long customerId) {
        Customer  customer = getCustomerById(customerId);
        customerRepository.delete(customer);
    }


}
