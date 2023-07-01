package com.example.juinwebdev.soccerbackend.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.juinwebdev.soccerbackend.models.PlayerM;
import com.example.juinwebdev.soccerbackend.repositories.PlayerRepository;
import com.example.juinwebdev.soccerbackend.services.PlayerService;
@Service
public class PlayerServiceImpl implements PlayerService {
	@Autowired
	public PlayerRepository playerRepo;
	@Override
	public List<PlayerM> getAllPlayers() {
		// TODO Auto-generated method stub
		return playerRepo.findAll();
	}

	@Override
	public PlayerM addPlayer(PlayerM m) {
		// TODO Auto-generated method stub
		return playerRepo.save(m);
	}
	

	@Override
	public PlayerM editPlayer(PlayerM m) {
		// TODO Auto-generated method stub
		return playerRepo.save(m);
	}

	@Override
	public void deletePlayerById(Integer id) {
		// TODO Auto-generated method stub
		 playerRepo.deleteById(id);
	}

	@Override
	public PlayerM  getPlayerById(Integer id) {
		// TODO Auto-generated method stub
		Optional<PlayerM>m =playerRepo.findById(id);
		return m.isPresent() ? m.get():null;
	}

}
