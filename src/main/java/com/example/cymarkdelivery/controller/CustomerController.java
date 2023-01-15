package com.example.cymarkdelivery.controller;

import com.example.cymarkdelivery.DTOs.CustomerResponse;
import com.example.cymarkdelivery.model.Customer;
import com.example.cymarkdelivery.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/customer/api/vi")
@RestController
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService){
        this.customerService = customerService;
    }

    @GetMapping("/getCustomer/{id}")
    public ResponseEntity<?> getCustomer(@PathVariable("id") long id){
           return new ResponseEntity <>(customerService.getCustomerById(id), HttpStatus.OK);
    }

    @PostMapping("/addCustomer")
    public ResponseEntity<Customer> addCustomer(@RequestBody CustomerResponse customerResponse){
        return new ResponseEntity<>(customerService.addCustomer(customerResponse), HttpStatus.CREATED);
    }

    @PostMapping("/updateCustomer/{userid}")
    public ResponseEntity<Customer> updateCustomer( @PathVariable("userid") long userid, @RequestBody CustomerResponse customerResponse){
        return new ResponseEntity<>(customerService.updateCustomer(userid, customerResponse), HttpStatus.OK);
    }

    @DeleteMapping("/deleteCustomer/{userid}")
    public ResponseEntity<?> deleteCustomer(@PathVariable("userid") long userid){
//        return new ResponseEntity<>(customerService.deleteCustomer(userid), HttpStatus.NO_CONTENT);
        customerService.deleteCustomer(userid);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);


    }

}
