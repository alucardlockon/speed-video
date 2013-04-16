package com.ywh.biz;

import java.util.List;

import com.ywh.entity.Category;

public interface CategoryBiz {

	List<Category> getAllCategories();

	List<Category> getSubCategories(int id);

}
