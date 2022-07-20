package com.example.fuel_rest_api.repository;

import com.example.fuel_rest_api.entities.Role;
import com.example.fuel_rest_api.entities.RoleID;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepo extends CrudRepository<Role, RoleID> {
    Role findRoleByUser_name(String name);
}
