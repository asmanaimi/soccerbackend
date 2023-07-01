package com.example.juinwebdev.soccerbackend.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PlayerM {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="Player_ID")
	private int id;
	private String name;
	private String position;
	private String number;
	private String team;
	public PlayerM() {
		
		// TODO Auto-generated constructor stub
	}
	public PlayerM(String name, String position, String number, String team) {
		super();
		this.name = name;
		this.position = position;
		this.number = number;
		this.team = team;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	@Override
	public String toString() {
		return "PlayerM [name=" + name + ", position=" + position + ", number=" + number + ", team=" + team + "]";
	}
	
}
