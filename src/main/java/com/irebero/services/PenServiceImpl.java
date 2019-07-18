package com.irebero.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.irebero.entities.Pen;
import com.irebero.repos.PenRepository;

@Service
public class PenServiceImpl implements PenService{

	@Autowired
	private PenRepository repository;
	
	@Override
	public Pen savePen(Pen pen) {
		return repository.save(pen);
	}

	@Override
	public Pen updatePen(Pen pen) {
		return repository.save(pen);
	}

	@Override
	public void deletePen(Pen pen) {
		repository.delete(pen);
		
	}

	@Override
	public Pen getPenById(int penId) {
		return repository.findById(penId).orElse(null);
	}

	@Override
	public List<Pen> getAllPens() {
		return repository.findAll();
	}

	public PenRepository getRepository() {
		return repository;
	}

	public void setRepository(PenRepository repository) {
		this.repository = repository;
	}

}
