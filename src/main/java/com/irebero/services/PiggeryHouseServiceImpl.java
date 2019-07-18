package com.irebero.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.irebero.entities.PiggeryHouse;
import com.irebero.repos.PiggeryHouseRepository;

@Service
public class PiggeryHouseServiceImpl implements PiggeryHouseService{

	
	@Autowired
	private PiggeryHouseRepository repository;
	
	
	@Override
	public PiggeryHouse savePiggeryHouse(PiggeryHouse piggeryHouse) {
		return repository.save(piggeryHouse);
	}

	@Override
	public PiggeryHouse updatePiggeryHouse(PiggeryHouse piggeryHouse) {
		return repository.save(piggeryHouse);
	}

	@Override
	public void deletePiggeryHouse(PiggeryHouse piggeryHouse) {
		repository.delete(piggeryHouse);
		
	}

	@Override
	public PiggeryHouse getPiggeryHouseById(int piggeryHouseId) {
		return repository.findById(piggeryHouseId).orElse(null);
	}

	@Override
	public List<PiggeryHouse> getAllPiggeryHouse() {
		return repository.findAll();
	}

	public PiggeryHouseRepository getRepository() {
		return repository;
	}

	public void setRepository(PiggeryHouseRepository repository) {
		this.repository = repository;
	}

	
}
