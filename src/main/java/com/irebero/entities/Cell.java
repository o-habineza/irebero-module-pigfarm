package com.irebero.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Cell {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cellId;
	private String cellName;
	@ManyToOne(targetEntity= Sector.class)
	private int sectorId;
	
	public Cell(int cellId, String cellName, int sectorId) {
		super();
		this.cellId = cellId;
		this.cellName = cellName;
		this.sectorId = sectorId;
	}

	public Cell() {
	}

	public int getCellId() {
		return cellId;
	}

	public void setCellId(int cellId) {
		this.cellId = cellId;
	}

	public String getCellName() {
		return cellName;
	}

	public void setCellName(String cellName) {
		this.cellName = cellName;
	}

	public int getSectorId() {
		return sectorId;
	}

	public void setSectorId(int sectorId) {
		this.sectorId = sectorId;
	}

	@Override
	public String toString() {
		return "Cell [cellId=" + cellId + ", cellName=" + cellName + ", sectorId=" + sectorId + "]";
	}
	
}
