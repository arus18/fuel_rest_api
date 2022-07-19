package com.example.fuel_rest_api.customer_controller;

import com.example.fuel_rest_api.auth.Role;
import com.example.fuel_rest_api.auth.RoleRepo;
import com.example.fuel_rest_api.auth.User;
import com.example.fuel_rest_api.auth.UserRepo;
import com.example.fuel_rest_api.customer.Customer;
import com.example.fuel_rest_api.customer.CustomerRepo;
import org.apache.commons.collections.IteratorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerRepo customerRepo;


    @GetMapping("test")
    public String test(){
        return "test";
    }

    @PostMapping("new_customer")
    public Customer newCustomer(@RequestBody Customer customer){
        return customerRepo.save(customer);
    }

    @GetMapping("customers")
    public List<Customer> customerList(){
        return IteratorUtils.toList(customerRepo.findAll().iterator());
    }

    @GetMapping("get_customer/{name}")
    public Customer getCustomer(@PathVariable String name){
        return customerRepo.findCustomerByLastName(name);
    }


}
