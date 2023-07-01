package com.example.juinwebdev.soccerbackend.services;

import java.util.List;

import com.example.juinwebdev.soccerbackend.models.MatchM;

public interface MatchService {

public List<MatchM>	 getAllMatches();
public MatchM addMatch(MatchM m);	
public MatchM editMatch(MatchM m);
public void  deleteMatchById(Integer id);
public MatchM getMatchById(Integer id);
}
