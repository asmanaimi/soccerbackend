package com.example.juinwebdev.soccerbackend.services;

import java.util.List;

import com.example.juinwebdev.soccerbackend.models.PlayerM;

public interface PlayerService {
	public List<PlayerM>	 getAllPlayers();
	public PlayerM addPlayer(PlayerM m);	
	public PlayerM editPlayer(PlayerM m);
	public void  deletePlayerById(Integer id);
	public PlayerM getPlayerById(Integer id);
}
