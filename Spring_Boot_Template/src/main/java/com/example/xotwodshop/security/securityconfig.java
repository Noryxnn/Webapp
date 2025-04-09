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
                        .requestMatchers("/", "/login").permitAll() // Allow public access to homepage and login
                )
                .formLogin(form -> form
                        .loginPage("/login")                       // Use custom login page
                        .permitAll()
                )
                .logout(logout -> logout.permitAll());         // Allow logout for all users

        return http.build();
    }
}