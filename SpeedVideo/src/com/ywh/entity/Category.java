package com.ywh.entity;

import java.util.List;

public class Category {
	private int id;
	private String name;
	private List<Category> subcategory;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Category> getSubcategory() {
		return subcategory;
	}

	public void setSubcategory(List<Category> subcategory) {
		this.subcategory = subcategory;
	}

}
