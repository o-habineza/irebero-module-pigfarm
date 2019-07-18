package com.irebero.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Pen {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int penId;
	private String penName;
	@ManyToOne(targetEntity= PiggeryHouse.class)
	private int piggeryHouseId;
	
	public Pen(int penId, String penName, int piggeryHouseId) {
		super();
		this.penId = penId;
		this.penName = penName;
		this.piggeryHouseId = piggeryHouseId;
	}

	public Pen() {
	}

	public int getPenId() {
		return penId;
	}

	public void setPenId(int penId) {
		this.penId = penId;
	}

	public String getPenName() {
		return penName;
	}

	public void setPenName(String penName) {
		this.penName = penName;
	}

	public int getPiggeryHouseId() {
		return piggeryHouseId;
	}

	public void setPiggeryHouseId(int piggeryHouseId) {
		this.piggeryHouseId = piggeryHouseId;
	}

	@Override
	public String toString() {
		return "Pen [penId=" + penId + ", penName=" + penName + ", piggeryHouseId=" + piggeryHouseId + "]";
	}
	
}
