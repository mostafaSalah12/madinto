package com.platformhouse.allegypt.model.places;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Activities {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int activityId;
	@Column(length = 50)
	private String activityNameAr;
	@Column(length = 50)
	private String activityNameEn;
	
	public Activities(){}

	public Activities(String activityNameAr, String activityNameEn) {
		super();
		this.activityNameAr = activityNameAr;
		this.activityNameEn = activityNameEn;
	}

	public String getActivityNameAr() {
		return activityNameAr;
	}

	public void setActivityNameAr(String activityNameAr) {
		this.activityNameAr = activityNameAr;
	}

	public String getActivityNameEn() {
		return activityNameEn;
	}

	public void setActivityNameEn(String activityNameEn) {
		this.activityNameEn = activityNameEn;
	}

	public int getActivityId() {
		return activityId;
	}
	
	

}
