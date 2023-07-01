package com.example.juinwebdev.soccerbackend.controllers;
import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired(required=true);
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
import com.example.juinwebdev.soccerbackend.models.MatchM;
import com.example.juinwebdev.soccerbackend.services.MatchService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

@RequestMapping("/matches")

public class MatchController {
	

	@Autowired
	private MatchService matchService;
	
	@GetMapping
	 public List<MatchM> getAllMatches(){
	 return matchService.getAllMatches();
	}
	@PostMapping
	public MatchM addMatch(@RequestBody MatchM matche) {
	 return matchService.addMatch(matche);
	 }
	@GetMapping("/{id}")
	public MatchM getMatchesById(@PathVariable Integer id  ) {
	return matchService.getMatchById(id);
	}
	@PutMapping
	public MatchM update(@RequestBody MatchM matche) {
		//matche.setId(id);
	 return matchService.editMatch(matche);
	}
	

	 
	 @DeleteMapping("/{id}")
	public void delete(@PathVariable  Integer  id) {
	 matchService.deleteMatchById(id);
	 }
	
}
