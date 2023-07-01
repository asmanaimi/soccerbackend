package com.example.juinwebdev.soccerbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.juinwebdev.soccerbackend.models.PlayerM;


public interface PlayerRepository extends JpaRepository<PlayerM,Integer>{

}
