package com.example.juinwebdev.soccerbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.juinwebdev.soccerbackend.models.TeamM;

public interface TeamRepository extends JpaRepository<TeamM,Integer> {

}
