package com.example.fuel_rest_api.auth;
import org.springframework.data.repository.CrudRepository;


public interface UserRepo extends CrudRepository<com.example.fuel_rest_api.auth.User,String> {
    User findByName(String name);
}
