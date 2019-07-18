package com.irebero.repos;


import org.springframework.data.jpa.repository.JpaRepository;
import com.irebero.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
	
}
