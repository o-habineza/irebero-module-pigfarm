package com.irebero.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity
public class PiggeryHouse {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int piggeryHouseId;
	private String piggeryHouseName;
	private String size;
	@ManyToOne(targetEntity= Village.class)
	private int villageId;
	@ManyToOne(targetEntity= User.class)
	private int userId;
	@OneToOne(targetEntity= Pen.class)
	private int penId;
	
	public PiggeryHouse(int piggeryHouseId, String piggeryHouseName, String size, int villageId, int userId,
			int penId) {
		super();
		this.piggeryHouseId = piggeryHouseId;
		this.piggeryHouseName = piggeryHouseName;
		this.size = size;
		this.villageId = villageId;
		this.userId = userId;
		this.penId = penId;
	}

	public PiggeryHouse() {
	}

	public int getPiggeryHouseId() {
		return piggeryHouseId;
	}

	public void setPiggeryHouseId(int piggeryHouseId) {
		this.piggeryHouseId = piggeryHouseId;
	}

	public String getPiggeryHouseName() {
		return piggeryHouseName;
	}

	public void setPiggeryHouseName(String piggeryHouseName) {
		this.piggeryHouseName = piggeryHouseName;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getVillageId() {
		return villageId;
	}

	public void setVillageId(int villageId) {
		this.villageId = villageId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getPenId() {
		return penId;
	}

	public void setPenId(int penId) {
		this.penId = penId;
	}

	@Override
	public String toString() {
		return "PiggeryHouse [piggeryHouseId=" + piggeryHouseId + ", piggeryHouseName=" + piggeryHouseName + ", size="
				+ size + ", villageId=" + villageId + ", userId=" + userId + ", penId=" + penId + "]";
	}
	
}
