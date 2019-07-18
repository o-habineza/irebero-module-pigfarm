package com.irebero.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Event {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int eventId;
	private String eventName;
	private Date eventDate;
	@OneToOne(targetEntity= PiggeryHouse.class)
	private int piggeryHouseId;
	@OneToOne(targetEntity= Pig.class)
	private int tagNumber;
	
	public Event(int eventId, String eventName, Date eventDate, int piggeryHouseId, int tagNumber) {
		super();
		this.eventId = eventId;
		this.eventName = eventName;
		this.eventDate = eventDate;
		this.piggeryHouseId = piggeryHouseId;
		this.tagNumber = tagNumber;
	}

	public Event() {
	}

	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public Date getEventDate() {
		return eventDate;
	}

	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}

	public int getPiggeryHouseId() {
		return piggeryHouseId;
	}

	public void setPiggeryHouseId(int piggeryHouseId) {
		this.piggeryHouseId = piggeryHouseId;
	}

	public int getTagNumber() {
		return tagNumber;
	}

	public void setTagNumber(int tagNumber) {
		this.tagNumber = tagNumber;
	}

	@Override
	public String toString() {
		return "Event [eventId=" + eventId + ", eventName=" + eventName + ", eventDate=" + eventDate
				+ ", piggeryHouseId=" + piggeryHouseId + ", tagNumber=" + tagNumber + "]";
	}
	
}
