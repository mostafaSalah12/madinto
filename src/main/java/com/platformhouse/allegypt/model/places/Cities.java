package com.platformhouse.allegypt.model.places;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cities {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cityId;
	@Column(length = 50)	
	private String nameAr;
	@Column(length = 50)
	private String nameEn;
	@Column(length = 100)
	private String cityPath;
	@Column(length = 1)
	private short active;
	
	
	public Cities(){}


	public Cities(String nameAr, String nameEn, String cityPath, short active) {
		
		this.nameAr = nameAr;
		this.nameEn = nameEn;
		this.cityPath = cityPath;
		this.active = active;
	}


	public String getNameAr() {
		return nameAr;
	}


	public void setNameAr(String nameAr) {
		this.nameAr = nameAr;
	}


	public String getNameEn() {
		return nameEn;
	}


	public void setNameEn(String nameEn) {
		this.nameEn = nameEn;
	}


	public String getCityPath() {
		return cityPath;
	}


	public void setCityPath(String cityPath) {
		this.cityPath = cityPath;
	}


	public short getActive() {
		return active;
	}


	public void setActive(short active) {
		this.active = active;
	}


	public int getCityId() {
		return cityId;
	}
	
	
	
	

}
