package com.example.fuel_rest_api.auth;
import jdk.jfr.DataAmount;

import java.io.Serializable;

public class RoleID implements Serializable {//created for composite key used in role class

    private String user_name;
    private String role;

    public String getName() {
        return user_name;
    }

    public void setName(String name) {
        this.user_name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
