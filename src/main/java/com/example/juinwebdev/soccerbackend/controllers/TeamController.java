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

import com.example.juinwebdev.soccerbackend.models.TeamM;
import com.example.juinwebdev.soccerbackend.services.TeamService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

@RequestMapping("/teams")
public class TeamController {

	@Autowired
	private TeamService teamService;
	
	@GetMapping
	 public List<TeamM> getAllTeams(){
	 return teamService.getAllTeams();
	}
	@PostMapping
	public TeamM addTeam(@RequestBody TeamM team) {
	 return teamService.addTeam(team);
	 }
	@GetMapping("/{id}")
	public TeamM getTeamsById(@PathVariable Integer id  ) {
	return teamService.getTeamById(id);
	}
	@PutMapping("/{id}")
	public TeamM update(@PathVariable  Integer  id ,@RequestBody TeamM team) {
		team.setId(id);
	 return teamService.editTeam(team);
	}
	

	 
	 @DeleteMapping("/{id}")
	public void delete(@PathVariable  Integer  id) {
		 teamService.deleteTeamById(id);
	 }
	


}
