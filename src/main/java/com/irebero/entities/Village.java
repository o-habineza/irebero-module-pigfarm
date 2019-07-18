package com.irebero.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Village {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int villageId;
	private String villageName;
	@ManyToOne(targetEntity= Cell.class)
	private int cellId;
	
	public Village(int villageId, String villageName, int cellId) {
		super();
		this.villageId = villageId;
		this.villageName = villageName;
		this.cellId = cellId;
	}

	public Village() {
	}

	public int getVillageId() {
		return villageId;
	}

	public void setVillageId(int villageId) {
		this.villageId = villageId;
	}

	public String getVillageName() {
		return villageName;
	}

	public void setVillageName(String villageName) {
		this.villageName = villageName;
	}

	public int getCellId() {
		return cellId;
	}

	public void setCellId(int cellId) {
		this.cellId = cellId;
	}

	@Override
	public String toString() {
		return "Village [villageId=" + villageId + ", villageName=" + villageName + ", cellId=" + cellId + "]";
	}

}
