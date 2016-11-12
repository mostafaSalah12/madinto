package com.platformhouse.allegypt.model.places;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class PlacesAddress {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long addressId;
	@Column(length = 400)
	private String addressAr;
	@Column(length = 400)
	private String addressEn;
	@ManyToOne
	@JoinColumn(name="place_area_fk")
	private PlaceArea placeArea;
	
	
	public PlacesAddress(){}

}
