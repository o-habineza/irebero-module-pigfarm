package com.irebero.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.irebero.entities.Pen;

public interface PenRepository extends JpaRepository<Pen, Integer> {

}
