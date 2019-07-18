package com.irebero.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.irebero.entities.Pig;
import com.irebero.repos.PigRepository;


@Service
public class PigServiceImpl implements PigService{

	@Autowired
	private PigRepository pigrepository;
	
	@Override
	public Pig savePig(Pig pig) {		
		return pigrepository.save(pig);
	}

	@Override
	public Pig updatePig(Pig pig) {
		return pigrepository.save(pig);		
	}

	@Override
	public void deletePig(Pig pig) {
		pigrepository.delete(pig);
		
	}

	@Override
	public Pig getPigById(int pigId) {
		return pigrepository.findById(pigId).orElse(null);
	}

	@Override
	public List<Pig> getAllPigs() {
		return pigrepository.findAll();
	}

	public PigRepository getPigrepository() {
		return pigrepository;
	}

	public void setPigrepository(PigRepository pigrepository) {
		this.pigrepository = pigrepository;
	}

}
