package com.example.juinwebdev.soccerbackend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.juinwebdev.soccerbackend.models.PlayerM;
import com.example.juinwebdev.soccerbackend.services.PlayerService;
@RestController
@CrossOrigin(origins = "http://localhost:4200")

@RequestMapping("/players")

public class PlayerController {
	@Autowired
	private PlayerService playerService;
	
	@GetMapping
	 public List<PlayerM> getAllPlayers(){
	 return playerService.getAllPlayers();
	}
	@PostMapping
	public PlayerM addPlayer(@RequestBody PlayerM player) {
	 return playerService.addPlayer(player);
	 }
	@GetMapping("/{id}")
	public PlayerM getPlayersById(@PathVariable Integer id  ) {
	return playerService.getPlayerById(id);
	}
	@PutMapping("/{id}")
	public PlayerM update(@PathVariable  Integer  id ,@RequestBody PlayerM player) {
		player.setId(id);
	 return playerService.editPlayer(player);
	}
	

	 
	 @DeleteMapping("/{id}")
	public void delete(@PathVariable  Integer  id) {
		 playerService.deletePlayerById(id);;
	 }
}
