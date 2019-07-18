package com.irebero.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.irebero.entities.Pig;

public interface PigRepository extends JpaRepository<Pig, Integer> {

}