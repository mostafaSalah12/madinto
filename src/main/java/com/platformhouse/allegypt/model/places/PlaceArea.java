package com.platformhouse.allegypt.model.places;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class PlaceArea {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long areaId;
	@Column(length = 50)
	private String nameAr;
	@Column(length = 50)
	private String nameEn;
	@ManyToOne
	@JoinColumn(name="zone_fk")
	private PlaceZone zone;
	
	public PlaceArea (){}

	public PlaceArea(String nameAr, String nameEn, PlaceZone zone) {
		super();
		this.nameAr = nameAr;
		this.nameEn = nameEn;
		this.zone = zone;
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

	public PlaceZone getZone() {
		return zone;
	}

	public void setZone(PlaceZone zone) {
		this.zone = zone;
	}

	public long getAreaId() {
		return areaId;
	}
	
	
	
}
