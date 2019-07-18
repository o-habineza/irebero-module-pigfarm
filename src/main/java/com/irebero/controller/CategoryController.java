package com.irebero.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.irebero.entities.Category;
import com.irebero.services.CategoryService;

@Controller
public class CategoryController {
	
	@Autowired
	CategoryService service;
	
	//Display create category page
	@RequestMapping("/showCat")
	public String showCategoryPage() {
		return "createCategory";
	}	
		
	//Add new category
	@RequestMapping(value="/addCat", method=RequestMethod.POST)
	public String addCat(@ModelAttribute("category")Category category) {
		service.saveCategory(category);
		return "redirect:/shCat";
	}
	
	//Display category list
	@RequestMapping(value="/shCat", method=RequestMethod.GET)
	public String index(ModelMap modelMap) {
	List<Category> categories = service.getAllCategories();
	modelMap.addAttribute("categories",categories);
	return "displayCategory";
	}	
	
	//Delete category
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String delete(@RequestParam("id") int categoryId,ModelMap modelMap) {
		Category category =	new Category();
		category.setCategoryId(categoryId);
		service.deleteCategory(category);
		List<Category> categories = service.getAllCategories();
		modelMap.addAttribute("categories",categories);
		return "redirect:/shCat";
	}
	
	//Display Edit Category
	@RequestMapping(value="/updt", method=RequestMethod.GET)
	public String updt(@RequestParam("id") int categoryId,ModelMap modelMap) {	
		Category category = service.getCategoryById(categoryId);
		modelMap.addAttribute("category",category);
				return "updateCategory";
	}
	//Update category
	@RequestMapping(value="/edit", method=RequestMethod.POST)
	public String edit(@ModelAttribute("category")Category category,ModelMap modelMap) {
		service.updateCategory(category);
		List<Category> categories = service.getAllCategories();
		modelMap.addAttribute("categories",categories);			
		return "redirect:/shCat";
	}
	
}

