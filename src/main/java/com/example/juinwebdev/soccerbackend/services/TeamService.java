package com.example.juinwebdev.soccerbackend.services;

import java.util.List;

import com.example.juinwebdev.soccerbackend.models.TeamM;

public interface TeamService {
	public List<TeamM>	getAllTeams();
	public TeamM addTeam(TeamM m);	
	public TeamM editTeam(TeamM m);
	public void  deleteTeamById(Integer id);
	public TeamM getTeamById(Integer id);
}
