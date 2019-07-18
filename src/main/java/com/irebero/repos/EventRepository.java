package com.irebero.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.irebero.entities.Event;

public interface EventRepository extends JpaRepository<Event, Integer> {

}
