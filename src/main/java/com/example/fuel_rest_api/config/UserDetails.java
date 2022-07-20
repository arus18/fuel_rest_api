package com.example.fuel_rest_api.config;
import com.example.fuel_rest_api.entities.Role;
import com.example.fuel_rest_api.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class UserDetails implements UserDetailsService {

    @Autowired
    UserRepo userRepo;

    @Override
    public org.springframework.security.core.userdetails.UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        com.example.fuel_rest_api.entities.User user = userRepo.findByName(username); //get user by name
        return new User(user.getName(),user.getPassword(),getGrantedAuthorities(user.getRoles()));
    }
    private List<GrantedAuthority> getGrantedAuthorities(List<Role> roles) { //create granted authorities using user roles
        List<GrantedAuthority> authorities = new ArrayList<>();
        for (Role role : roles) {
            authorities.add(new SimpleGrantedAuthority(role.getRole()));
        }
        return authorities;
    }
}
