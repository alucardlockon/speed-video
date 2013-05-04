package com.ywh.web.action;

import java.util.List;

import com.ywh.biz.CategoryBiz;
import com.ywh.entity.Category;

/**
 * 目录Action,主目录，下级目录的显示管理
 * @author YWH
 */
public class CategoryAction {
	private List<Category> categories;
	CategoryBiz categoryBiz;

	/**
	 * 显示目录
	 */
	public String getCategory() {
		categories = categoryBiz.getAllCategories();
		// Hibernate关联映射后不必使用此方法
		for (Category sub : categories) {
			sub.setSubcategory(categoryBiz.getSubCategories(sub.getId()));
		}
		return "getCategory";
	}

	/**
	 * 在上传页面的列表中显示目录信息
	 */
	public String selector() {
		categories = categoryBiz.getAllCategories();
		for (Category sub : categories) {
			sub.setSubcategory(categoryBiz.getSubCategories(sub.getId()));
		}
		return "selector";
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
