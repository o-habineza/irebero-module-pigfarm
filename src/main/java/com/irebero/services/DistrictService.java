package com.irebero.services;

import java.util.List;
import com.irebero.entities.District;;


public interface DistrictService {

	List<District> getAllDistricts();
	void loadedDistricts();	
	List<District> getDistrictsbyProvince(int provinceId);
}
