package com.example.fuel_rest_api.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
public class ApiConfig  {

    @Bean
    public UserDetailsService userDetailsService(){
        return new UserDetails();
    }
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/get_buy_details","/customers").hasAnyAuthority("ADMIN")//only admin can access buy details and customer details
                .anyRequest().authenticated().and().httpBasic().and().csrf().disable();
        return http.build();
    }
}
