package com.platformhouse.allegypt.model.places;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class PlaceZone {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long zoneId;
	@Column(length = 50)
	private String nameAr;
	@Column(length = 50)
	private String nameEn;
	@Column(length = 1)
	private short active;
	@ManyToOne
	@JoinColumn(name="city_fk")
	private Cities city;
	public PlaceZone(){}
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
	public short getActive() {
		return active;
	}
	public void setActive(short active) {
		this.active = active;
	}
	public int getCity() {
		return this.city.getCityId();
	}
	public void setCity(Cities city) {
		this.city = city;
	}
	public long getZoneId() {
		return zoneId;
	}
	
	
	
}
