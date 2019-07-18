package com.irebero.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Race {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int raceId;
	private String description;
	
	public Race(int raceId, String description) {
		super();
		this.raceId = raceId;
		this.description = description;
	}

	public Race() {
	}

	public int getRaceId() {
		return raceId;
	}

	public void setRaceId(int raceId) {
		this.raceId = raceId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Race [raceId=" + raceId + ", description=" + description + "]";
	}
	
}
