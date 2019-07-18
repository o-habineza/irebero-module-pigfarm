package com.irebero.entities;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;



@Entity
@Table(name="pig")
@EntityListeners(AuditingEntityListener.class)
public class Pig {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int pigId;
	private int tagNumber; 
	private Date dob; 
	private String weight; 
	private String sex; 
	@OneToOne(targetEntity= Race.class)
	private int raceId; 
	@OneToOne(targetEntity= Category.class)
	private int categoryId; 
	@OneToOne(targetEntity= PiggeryHouse.class)
	private int piggeryHouseId; 
	@OneToOne(targetEntity= FeedingProgram.class)
	private int fprogramId; 
	@OneToMany(targetEntity= Event.class)
	private Set<Integer> eventId;	
	@OneToOne(targetEntity= Village.class)
	private int villageId; 
	@OneToOne(targetEntity= User.class)
	private int userId;
	
	public Pig(int pigId, int tagNumber, Date dob, String weight, String sex, int raceId, int categoryId,
			int piggeryHouseId, int fprogramId, Set<Integer> eventId, int villageId, int userId) {
		super();
		this.pigId = pigId;
		this.tagNumber = tagNumber;
		this.dob = dob;
		this.weight = weight;
		this.sex = sex;
		this.raceId = raceId;
		this.categoryId = categoryId;
		this.piggeryHouseId = piggeryHouseId;
		this.fprogramId = fprogramId;
		this.eventId = eventId;
		this.villageId = villageId;
		this.userId = userId;
	}
	
	public Pig() {
	}

	public int getPigId() {
		return pigId;
	}

	public void setPigId(int pigId) {
		this.pigId = pigId;
	}

	public int getTagNumber() {
		return tagNumber;
	}

	public void setTagNumber(int tagNumber) {
		this.tagNumber = tagNumber;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getRaceId() {
		return raceId;
	}

	public void setRaceId(int raceId) {
		this.raceId = raceId;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getPiggeryHouseId() {
		return piggeryHouseId;
	}

	public void setPiggeryHouseId(int piggeryHouseId) {
		this.piggeryHouseId = piggeryHouseId;
	}

	public int getFprogramId() {
		return fprogramId;
	}

	public void setFprogramId(int fprogramId) {
		this.fprogramId = fprogramId;
	}

	public Set<Integer> getEventId() {
		return eventId;
	}

	public void setEventId(Set<Integer> eventId) {
		this.eventId = eventId;
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

	@Override
	public String toString() {
		return "Pig [pigId=" + pigId + ", tagNumber=" + tagNumber + ", dob=" + dob + ", weight=" + weight + ", sex="
				+ sex + ", raceId=" + raceId + ", categoryId=" + categoryId + ", piggeryHouseId=" + piggeryHouseId
				+ ", fprogramId=" + fprogramId + ", eventId=" + eventId + ", villageId=" + villageId + ", userId="
				+ userId + "]";
	}
	
}
