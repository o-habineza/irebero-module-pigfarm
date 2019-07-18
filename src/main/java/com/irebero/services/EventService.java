package com.irebero.services;

import java.util.List;

import com.irebero.entities.Event;;

public interface EventService {
    
	Event saveEvent(Event event);
	
	Event updateEvent(Event event);
	
	void deleteEvent(Event event);
	
	Event getEventById(int eventId);
	
	List<Event>	getAllEvents();
}
