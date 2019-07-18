package com.irebero.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.irebero.entities.Event;
import com.irebero.repos.EventRepository;

@Service
public class EventServiceImpl implements EventService{

	@Autowired
	private EventRepository repository;
	
	
	@Override
	public Event saveEvent(Event event) {
		return repository.save(event);
	}

	@Override
	public Event updateEvent(Event event) {
		return repository.save(event);
	}

	@Override
	public void deleteEvent(Event event) {
	   repository.delete(event);
		
	}

	@Override
	public Event getEventById(int eventId) {
		return repository.findById(eventId).orElse(null);
	}

	@Override
	public List<Event> getAllEvents() {
		return repository.findAll();
	}

	public EventRepository getRepository() {
		return repository;
	}

	public void setRepository(EventRepository repository) {
		this.repository = repository;
	}

	
}
