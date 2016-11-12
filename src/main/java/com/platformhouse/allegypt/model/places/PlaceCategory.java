package com.platformhouse.allegypt.model.places;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PlaceCategory {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int categoryId;
	@Column(length = 50)
	private String categoryNameAr;
	@Column(length = 50)
	private String categoryNameEn;
	
	
	public PlaceCategory(){
		
	}


	public PlaceCategory(String categoryNameAr, String categoryNameEn) {
		super();
		this.categoryNameAr = categoryNameAr;
		this.categoryNameEn = categoryNameEn;
	}


	public String getCategoryNameAr() {
		return categoryNameAr;
	}


	public void setCategoryNameAr(String categoryNameAr) {
		this.categoryNameAr = categoryNameAr;
	}


	public String getCategoryNameEn() {
		return categoryNameEn;
	}


	public void setCategoryNameEn(String categoryNameEn) {
		this.categoryNameEn = categoryNameEn;
	}


	public int getCategoryId() {
		return categoryId;
	}


	

}
