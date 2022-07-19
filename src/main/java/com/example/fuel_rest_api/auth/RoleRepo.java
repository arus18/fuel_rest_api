package com.example.fuel_rest_api.auth;

import org.springframework.data.repository.CrudRepository;

public interface RoleRepo extends CrudRepository<Role,RoleID> {
    Role findRoleByUser_name(String name);
}
