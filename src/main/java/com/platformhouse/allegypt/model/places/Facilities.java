package com.platformhouse.allegypt.model.places;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Facilities {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int facilityID;
	@Column(length = 50)
	private String facilityNameAr;
	@Column(length = 50)
	private String facilityNameEn;

	public Facilities(){}

	public Facilities(String facilityNameAr, String facilityNameEn) {
		super();
		this.facilityNameAr = facilityNameAr;
		this.facilityNameEn = facilityNameEn;
	}

	public String getFacilityNameAr() {
		return facilityNameAr;
	}

	public void setFacilityNameAr(String facilityNameAr) {
		this.facilityNameAr = facilityNameAr;
	}

	public String getFacilityNameEn() {
		return facilityNameEn;
	}

	public void setFacilityNameEn(String facilityNameEn) {
		this.facilityNameEn = facilityNameEn;
	}

	public int getFacilityID() {
		return facilityID;
	}
	
	

}
