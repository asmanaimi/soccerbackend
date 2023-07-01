package com.example.juinwebdev.soccerbackend.services;


import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserServicesDetails {
    UserDetails loadUserByEmail(String email) throws UsernameNotFoundException;
}
