package com.irebero.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.irebero.entities.Category;
import com.irebero.repos.CategoryRepository;


@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private CategoryRepository repository;
	
	@Override
	public Category saveCategory(Category category) {		
		return repository.save(category);
	}

	@Override
	public Category updateCategory(Category category) {
		return repository.save(category);
	}

	@Override
	public void deleteCategory(Category category) {
		repository.delete(category);
		
	}

	@Override
	public Category getCategoryById(int categoryId) {
		return repository.findById(categoryId).orElse(null);
	}

	@Override
	public List<Category> getAllCategories() {		
		return repository.findAll();
	}

	public CategoryRepository getRepository() {
		return repository;
	}

	public void setRepository(CategoryRepository repository) {
		this.repository = repository;
	}

}
