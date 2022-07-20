package com.example.fuel_rest_api.repository;
import com.example.fuel_rest_api.entities.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepo extends CrudRepository<User,String> {
    User findByName(String name);
}
