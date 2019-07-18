package com.irebero.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.irebero.entities.Pig;
import com.irebero.services.PigService;

@Controller
public class PigController {
	

		@Autowired
		PigService pigservice;
		
		//Display create pig page
		@RequestMapping("/showPig")
		public String showPigPage() {
			return "createPig";
		}	
			
		//Add new pig
		@RequestMapping(value="/addPig", method=RequestMethod.POST)
		public String addPig(@ModelAttribute("pig")Pig pig) {
			pigservice.savePig(pig);
			return "redirect:/shPig";
		}
		
		//Display pig list
		@RequestMapping(value="/shPig", method=RequestMethod.GET)
		public String index(ModelMap modelMap) {
		List<Pig> pigs = pigservice.getAllPigs();
		modelMap.addAttribute("pigs",pigs);
		return "displayPig";
		}	
		
		//Delete pig
		@RequestMapping(value="/deletepig", method=RequestMethod.GET)
		public String delete(@RequestParam("id") int pigId,ModelMap modelMap) {
			Pig pig =	new Pig();
			pig.setPigId(pigId);
			pigservice.deletePig(pig);
			List<Pig> pigs = pigservice.getAllPigs();
			modelMap.addAttribute("pigs",pigs);
			return "redirect:/shPig";
		}
		
		//Display Edit Pig
		@RequestMapping(value="/updtpig", method=RequestMethod.GET)
		public String updt(@RequestParam("id") int pigId,ModelMap modelMap) {	
			Pig pig = pigservice.getPigById(pigId);
			modelMap.addAttribute("pig",pig);
					return "updatePig";
		}
		//Update pig
		@RequestMapping(value="/editpig", method=RequestMethod.POST)
		public String edit(@ModelAttribute("pig")Pig pig,ModelMap modelMap) {
			pigservice.updatePig(pig);
			List<Pig> pigs = pigservice.getAllPigs();
			modelMap.addAttribute("pigs",pigs);			
			return "redirect:/shPig";
		}
	}


