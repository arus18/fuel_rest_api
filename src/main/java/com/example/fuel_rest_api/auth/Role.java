package com.example.fuel_rest_api.auth;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "roles")
@IdClass(RoleID.class)
public class Role implements Serializable {

    @Id
    private String user_name;

    @Id
    private String role;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_name", insertable = false,updatable = false)
    private com.example.fuel_rest_api.auth.User user;

    public Role() {
    }

    public Role(String name, String role) {
        this.user_name = name;
        this.role = role;
    }

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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
