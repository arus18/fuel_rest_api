package com.example.fuel_rest_api.controller;
import com.example.fuel_rest_api.entities.Customer;
import com.example.fuel_rest_api.repository.CustomerRepo;
import org.apache.commons.collections.IteratorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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
    }//create new customer

    @GetMapping("customers")
    public List<Customer> customerList(){
        return IteratorUtils.toList(customerRepo.findAll().iterator());
    }//get all customers

    @GetMapping("get_customer/{name}")
    public Customer getCustomer(@PathVariable String name){
        return customerRepo.findCustomerByLastName(name);
    }//get customer by name


}
