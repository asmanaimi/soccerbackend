package com.example.juinwebdev.soccerbackend.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.juinwebdev.soccerbackend.models.TeamM;
import com.example.juinwebdev.soccerbackend.repositories.TeamRepository;
import com.example.juinwebdev.soccerbackend.services.TeamService;
@Service
public class TeamServiceImpl implements TeamService{
	@Autowired
	public TeamRepository teamRepo;

	@Override
	public List<TeamM> getAllTeams() {
		// TODO Auto-generated method stub
		return teamRepo.findAll();
	}

	@Override
	public TeamM addTeam(TeamM m) {
		// TODO Auto-generated method stub
		return teamRepo.save(m);
	}

	@Override
	public TeamM editTeam(TeamM m) {
		// TODO Auto-generated method stub
		return teamRepo.save(m);	}

	@Override
	public void deleteTeamById(Integer id) {
		// TODO Auto-generated method stub
		 teamRepo.deleteById(id);
	}

	@Override
	public TeamM getTeamById(Integer id) {
		// TODO Auto-generated method stub
		Optional<TeamM>m =teamRepo.findById(id);
		return m.isPresent() ? m.get():null;
	}
}



