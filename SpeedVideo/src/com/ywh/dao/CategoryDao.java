package com.ywh.dao;

import java.util.List;

import com.ywh.entity.Category;

public interface CategoryDao {

	List<Category> findAllCategories();

	List<Category> findAllSubCategories(int id);


}
