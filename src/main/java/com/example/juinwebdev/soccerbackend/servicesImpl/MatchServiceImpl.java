package com.example.juinwebdev.soccerbackend.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.juinwebdev.soccerbackend.models.MatchM;
import com.example.juinwebdev.soccerbackend.repositories.MatchRepository;
import com.example.juinwebdev.soccerbackend.services.MatchService;

@Service
public class MatchServiceImpl implements MatchService{
	@Autowired
public MatchRepository matchRepo;
	@Override
	public List<MatchM> getAllMatches() {
		// TODO Auto-generated method stub
		return matchRepo.findAll();
	}

	@Override
	public MatchM addMatch(MatchM m) {
		// TODO Auto-generated method stub
		return matchRepo.save(m);
	}

	@Override
	public MatchM editMatch(MatchM m) {


		return matchRepo.save(m);
	}

	@Override
	public void deleteMatchById(Integer id) {
		 matchRepo.deleteById(id);
		
	}

	@Override
	public MatchM getMatchById(Integer id) {
		Optional<MatchM>m =matchRepo.findById(id);
		return m.isPresent() ? m.get():null;
	}

}
