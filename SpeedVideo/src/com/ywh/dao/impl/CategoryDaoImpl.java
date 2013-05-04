package com.ywh.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.ywh.dao.CategoryDao;
import com.ywh.entity.Category;

public class CategoryDaoImpl extends HibernateDaoSupport implements CategoryDao{
	/**
	 * 找到所有主目录
	 */
	public List<Category> findAllCategories() {
		String hql="from Category where pid=null";
		return this.getHibernateTemplate().find(hql);
	}
	/**
	 * 找到所有下级目录
	 */
	public List<Category> findAllSubCategories(int id) {
		String hql="from Category where pid=?";
		return this.getHibernateTemplate().find(hql,id);
	}
	/**
	 * 根据目录id寻找目录
	 */
	public Category findCategoryById(int id) {
		return (Category) this.getHibernateTemplate().get(Category.class, id);
	}


}
