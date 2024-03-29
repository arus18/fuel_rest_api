package com.example.fuel_rest_api.repository;

import com.example.fuel_rest_api.entities.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepo extends CrudRepository<Customer,Integer> {
    Customer findCustomerByLastName(String name);
}
