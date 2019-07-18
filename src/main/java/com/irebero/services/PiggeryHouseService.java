package com.irebero.services;

import java.util.List;

import com.irebero.entities.PiggeryHouse;

public interface PiggeryHouseService {

    PiggeryHouse savePiggeryHouse(PiggeryHouse piggeryHouse);
	
	PiggeryHouse updatePiggeryHouse(PiggeryHouse piggeryHouse);
	
	void deletePiggeryHouse(PiggeryHouse piggeryHouse);
	
	PiggeryHouse getPiggeryHouseById(int piggeryHouseId);
	
	List<PiggeryHouse>getAllPiggeryHouse();
	
}
