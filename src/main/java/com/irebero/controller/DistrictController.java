package com.irebero.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.irebero.entities.District;
import com.irebero.services.DistrictService;

@Controller
public class DistrictController {
	
	@Autowired
	DistrictService service;
	
	@ModelAttribute("districts")
	public List<District> initializeDistricts() {

	    List <District> districts = service.getAllDistricts();

	    return districts;
	} 

	
}
