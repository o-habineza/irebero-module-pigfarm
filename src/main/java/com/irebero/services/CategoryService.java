package com.irebero.services;


import java.util.List;
import com.irebero.entities.Category;


public interface CategoryService {
	
	
	Category saveCategory(Category category);
	
	Category updateCategory(Category category);
	
	void deleteCategory(Category category);
	
	Category getCategoryById(int categoryId);
	
	List<Category>	getAllCategories();
	
	
}
