package com.irebero.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.irebero.entities.Race;

public interface RaceRepository extends JpaRepository<Race, Integer> {

}
