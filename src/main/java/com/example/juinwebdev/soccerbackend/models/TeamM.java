package com.example.juinwebdev.soccerbackend.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TeamM {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="Team_ID")
	private int id;
	private String name ;
	private String coach;
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
	public String getCoach() {
		return coach;
	}
	public void setCoach(String coach) {
		this.coach = coach;
	}
	public TeamM() {
		// TODO Auto-generated constructor stub
	}
	public TeamM(String name, String coach) {
		super();
		this.name = name;
		this.coach = coach;
	}
	@Override
	public String toString() {
		return "TeamM [name=" + name + ", coach=" + coach + "]";
	}
	
}
