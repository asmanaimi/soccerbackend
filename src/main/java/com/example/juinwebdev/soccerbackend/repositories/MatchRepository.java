package com.example.juinwebdev.soccerbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.juinwebdev.soccerbackend.models.MatchM;
@Repository
public interface MatchRepository extends JpaRepository<MatchM,Integer> {

	
	
	
	
	
	
}
