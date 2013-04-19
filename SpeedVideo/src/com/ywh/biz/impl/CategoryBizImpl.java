package com.ywh.biz.impl;

import java.util.List;

import com.ywh.biz.CategoryBiz;
import com.ywh.dao.CategoryDao;
import com.ywh.entity.Category;

public class CategoryBizImpl implements CategoryBiz {
	CategoryDao categoryDao;

	public void setCategoryDao(CategoryDao categoryDao) {
		this.categoryDao = categoryDao;
	}

	public List<Category> getAllCategories() {
		return categoryDao.findAllCategories();
	}

	public List<Category> getSubCategories(int id) {
		return categoryDao.findAllSubCategories(id);
	}

	public Category getCategoryById(int id) {
		return categoryDao.findCategoryById(id);
	}
	
}
