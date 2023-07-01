package com.example.juinwebdev.soccerbackend.repositories;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.juinwebdev.soccerbackend.models.ERole;
import com.example.juinwebdev.soccerbackend.models.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(ERole name);
}
