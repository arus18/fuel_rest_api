package com.example.fuel_rest_api.customer;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepo extends CrudRepository<Customer,Integer> {
    Customer findCustomerByLastName(String name);
}
