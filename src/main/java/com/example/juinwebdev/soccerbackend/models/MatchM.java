package com.example.juinwebdev.soccerbackend.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MatchM {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="MATCH_ID")
	private int id;
	private String teamOne;
	private String teamTwo;
	private int scoreOne;
	private int scoreTwo;
	public MatchM() {
	}
	public MatchM(String teamOne, String teamTwo, int scoreOne, int scoreTwo) {
		this.teamOne = teamOne;
		this.teamTwo = teamTwo;
		this.scoreOne = scoreOne;
		this.scoreTwo = scoreTwo;
	}
	public String getTeamOne() {
		return teamOne;
	}
	public void setTeamOne(String teamOne) {
		this.teamOne = teamOne;
	}
	public String getTeamTwo() {
		return teamTwo;
	}
	public void setTeamTwo(String teamTwo) {
		this.teamTwo = teamTwo;
	}
	public int getScoreOne() {
		return scoreOne;
	}
	public void setScoreOne(int scoreOne) {
		this.scoreOne = scoreOne;
	}
	
	public int getScoreTwo() {
		return scoreTwo;
	}
	public void setScoreTwo(int scoreTwo) {
		this.scoreTwo = scoreTwo;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "MatchM [teamOne=" + teamOne + ", teamTwo=" + teamTwo + ", scoreOne=" + scoreOne + ", scoreTwo="
				+ scoreTwo + "]";
	}

	
	
	
	
}
