package com.platformhouse.allegypt.model.places;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class PlaceGroup {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int groupId;
	@Column(length = 50)
	private String placeGroupNameAr;
	@Column(length = 50)
	private String placeGroupNameEn;
	@Column(length = 255)
	private String groupIcon;
	@Column(length = 255)
	private String groupPhotoSmall;
	@Column(length = 255)
	private String groupPhotoBig;
	@ManyToOne
	private PlaceCategory category;
	
	public PlaceGroup(){}

	public PlaceGroup(String placeGroupNameAr, String placeGroupNameEn, String groupIcon, String groupPhotoSmall,
			String groupPhotoBig, PlaceCategory category) {
		super();
		this.placeGroupNameAr = placeGroupNameAr;
		this.placeGroupNameEn = placeGroupNameEn;
		this.groupIcon = groupIcon;
		this.groupPhotoSmall = groupPhotoSmall;
		this.groupPhotoBig = groupPhotoBig;
		this.category = category;
	}

	public String getPlaceGroupNameAr() {
		return placeGroupNameAr;
	}

	public void setPlaceGroupNameAr(String placeGroupNameAr) {
		this.placeGroupNameAr = placeGroupNameAr;
	}

	public String getPlaceGroupNameEn() {
		return placeGroupNameEn;
	}

	public void setPlaceGroupNameEn(String placeGroupNameEn) {
		this.placeGroupNameEn = placeGroupNameEn;
	}

	public String getGroupIcon() {
		return groupIcon;
	}

	public void setGroupIcon(String groupIcon) {
		this.groupIcon = groupIcon;
	}

	public String getGroupPhotoSmall() {
		return groupPhotoSmall;
	}

	public void setGroupPhotoSmall(String groupPhotoSmall) {
		this.groupPhotoSmall = groupPhotoSmall;
	}

	public String getGroupPhotoBig() {
		return groupPhotoBig;
	}

	public void setGroupPhotoBig(String groupPhotoBig) {
		this.groupPhotoBig = groupPhotoBig;
	}

	public PlaceCategory getCategory() {
		return category;
	}

	public void setCategory(PlaceCategory category) {
		this.category = category;
	}

	public int getGroupId() {
		return groupId;
	}
}
