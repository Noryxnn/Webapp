package com.example.xotwodshop.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class securityconfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(authorize -> authorize
                        .requestMatchers("/", "/login").permitAll() 
                )
                .formLogin(form -> form
                        .loginPage("/login")                      
                        .permitAll()
                )
                .logout(logout -> logout.permitAll());  

        return http.build();
    }
}