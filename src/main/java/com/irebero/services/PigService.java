package com.irebero.services;

import java.util.List;

import com.irebero.entities.Pig;

public interface PigService {

	Pig savePig(Pig pig);
	
	Pig updatePig(Pig pig);
	
	void deletePig(Pig pig);
	
	Pig getPigById(int pigId);
	
	List<Pig> getAllPigs();
}
