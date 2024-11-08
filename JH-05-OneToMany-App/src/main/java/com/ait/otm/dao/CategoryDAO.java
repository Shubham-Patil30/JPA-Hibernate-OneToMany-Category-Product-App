package com.ait.otm.dao;

import com.ait.otm.entities.CategoryEntity;

public interface CategoryDAO {
	
	public void saveCategory(CategoryEntity entity) ; 
	
	public CategoryEntity fetchCategory(Integer categoryId); 
	
	public void removeCategory(Integer categoryId); 
}
