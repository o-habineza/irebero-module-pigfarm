package com.irebero.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.irebero.entities.Province;
import com.irebero.repos.ProvinceRepository;

@Service
public class ProvinceServiceImpl implements ProvinceService{

	@Autowired
	ProvinceRepository repository;	
	
	
	@Override
	public List<Province> getAllProvinces() {
	    return repository.findAll();
	}


	public ProvinceRepository getRepository() {
		return repository;
	}


	public void setRepository(ProvinceRepository repository) {
		this.repository = repository;
	}

	
}
