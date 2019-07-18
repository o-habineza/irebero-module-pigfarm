package com.irebero.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FeedingProgram {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int fprogramId;
	private String fprogramName;
	
	public FeedingProgram(int fprogramId, String fprogramName) {
		super();
		this.fprogramId = fprogramId;
		this.fprogramName = fprogramName;
	}

	public FeedingProgram() {
	}

	public int getFprogramId() {
		return fprogramId;
	}

	public void setFprogramId(int fprogramId) {
		this.fprogramId = fprogramId;
	}

	public String getFprogramName() {
		return fprogramName;
	}

	public void setFprogramName(String fprogramName) {
		this.fprogramName = fprogramName;
	}

	@Override
	public String toString() {
		return "FeedingProgram [fprogramId=" + fprogramId + ", fprogramName=" + fprogramName + "]";
	}

}
