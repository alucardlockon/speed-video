package com.ywh.web.action;

import java.util.List;

import com.ywh.biz.CategoryBiz;
import com.ywh.entity.Category;

public class CategoryAction {
	private List<Category> categories;
	CategoryBiz categoryBiz;

	public String getCategory() {
		categories = categoryBiz.getAllCategories();
		// Hibernate关联映射后不必使用此方法
		for (Category sub : categories) {
			sub.setSubcategory(categoryBiz.getSubCategories(sub.getId()));
		}
		return "getCategory";
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	public void setCategoryBiz(CategoryBiz categoryBiz) {
		this.categoryBiz = categoryBiz;
	}

}
