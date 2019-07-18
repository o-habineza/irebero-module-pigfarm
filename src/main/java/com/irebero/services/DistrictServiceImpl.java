package com.irebero.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.irebero.entities.District;
import com.irebero.repos.DistrictRepository;

@Service
public class DistrictServiceImpl implements DistrictService {

	
	@Autowired
	DistrictRepository repository;	
	
	int subProvinceId;
	List<District>districtNames = new ArrayList<>();;
	
	@Override
	public List<District> getAllDistricts() {
		return repository.findAll();
	}

	@Override
	public void loadedDistricts() {
		 //Loads the districts depending on the selected province        
        districtNames.clear();        
        districtNames = getDistrictsbyProvince(subProvinceId);
		
	}	

	public DistrictRepository getRepository() {
		return repository;
	}

	public void setRepository(DistrictRepository repository) {
		this.repository = repository;
	}

	public int getSubProvinceId() {
		return subProvinceId;
	}

	public void setSubProvinceId(int subProvinceId) {
		this.subProvinceId = subProvinceId;
	}

	@Override
	public List<District> getDistrictsbyProvince(int provinceId) {
		return (List<District>) repository.findById(provinceId).orElse(null);
	}

	public List<District> getDistrictNames() {
		return districtNames;
	}

	public void setDistrictNames(List<District> districtNames) {
		this.districtNames = districtNames;
	}

}
