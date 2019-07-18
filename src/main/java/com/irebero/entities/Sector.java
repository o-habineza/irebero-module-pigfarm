package com.irebero.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Sector {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int sectorId;
	private String sectorName;
	@ManyToOne(targetEntity= District.class)
	private int districtId;
	
	public Sector(int sectorId, String sectorName, int districtId) {
		super();
		this.sectorId = sectorId;
		this.sectorName = sectorName;
		this.districtId = districtId;
	}

	public Sector() {
	}

	public int getSectorId() {
		return sectorId;
	}

	public void setSectorId(int sectorId) {
		this.sectorId = sectorId;
	}

	public String getSectorName() {
		return sectorName;
	}

	public void setSectorName(String sectorName) {
		this.sectorName = sectorName;
	}

	public int getDistrictId() {
		return districtId;
	}

	public void setDistrictId(int districtId) {
		this.districtId = districtId;
	}

	@Override
	public String toString() {
		return "Sector [sectorId=" + sectorId + ", sectorName=" + sectorName + ", districtId=" + districtId + "]";
	}
	
}
