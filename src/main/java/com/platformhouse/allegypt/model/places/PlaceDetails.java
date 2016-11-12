package com.platformhouse.allegypt.model.places;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import com.platformhouse.allegypt.model.common.BlogsEntry;

@Entity
public class PlaceDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long placeId;
	@Column(length = 100)
	private String nameAr;
	@Column(length = 100)
	private String nameEn;
	@ManyToOne
	private PlaceArea area;
	@ManyToOne
	private PlaceCategory category;
	@ManyToOne
	private PlaceGroup group;
	@Column(length = 500)
	private String descrption;
	private double gpsLat;
	private double gpsLng;
	@Column(length = 20)
	private String businessPhone1;
	@Column(length = 20)
	private String businessPhone2;
	@Column(length = 20)
	private String hotline;
	@Column(length = 50)
	private String email;
	@Column(length = 100)
	private String website;
	@Column(length = 50)
	private String facebookAccount;
	@Column(length = 50)
	private String twitterAccount;
	private double averageRatings;
	@Column(length = 20)
	private long totalReviews;
	@Column(length = 11)
	private int status;
	@Column(length = 20)
	private long placeOwner;
	@Column(columnDefinition = "DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date creationDateTime;
	@Column(length = 20)
	private long hasParent;
	@Column(length = 1)
	private short hasChild;
	@Column(length = 20)
	private long likes;
	@Column(columnDefinition = "TEXT")
	private String defaultBigPic;
	@Column(columnDefinition = "TEXT")
	private String defaultSmallPic;
	@Column(length = 11)
	private int currentDistinctionLevel;
	@Column(columnDefinition = "TEXT")
	private String others;
	@OneToOne
	private BlogsEntry blog;
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinTable(name = "PlAdrress", joinColumns = {
			@JoinColumn(name = "placeId", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "addressId", nullable = false, updatable = false) })
	private List<PlacesAddress> address;
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinTable(name = "PlActivities", joinColumns = {
			@JoinColumn(name = "placeId", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "activitieId", nullable = false, updatable = false) })
	private List<Activities> activities;

	public PlaceDetails() {
	}

	public PlaceDetails(String nameAr, String nameEn, PlaceCategory category, PlaceGroup group, String descrption,
			String businessPhone1, String email, String website, int status, long placeOwner, Date creationDateTime,
			List<PlacesAddress> address,List<Activities> activities) {
		super();
		this.nameAr = nameAr;
		this.nameEn = nameEn;
		this.category = category;
		this.group = group;
		this.descrption = descrption;
		this.businessPhone1 = businessPhone1;
		this.email = email;
		this.website = website;
		this.status = status;
		this.placeOwner = placeOwner;
		this.creationDateTime = creationDateTime;
		this.address = address;
		this.activities=activities;
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

	public PlaceArea getArea() {
		return area;
	}

	public void setArea(PlaceArea area) {
		this.area = area;
	}

	public PlaceCategory getCategory() {
		return category;
	}

	public void setCategory(PlaceCategory category) {
		this.category = category;
	}

	public PlaceGroup getGroup() {
		return group;
	}

	public void setGroup(PlaceGroup group) {
		this.group = group;
	}

	public String getDescrption() {
		return descrption;
	}

	public void setDescrption(String descrption) {
		this.descrption = descrption;
	}

	public double getGpsLat() {
		return gpsLat;
	}

	public void setGpsLat(double gpsLat) {
		this.gpsLat = gpsLat;
	}

	public double getGpsLng() {
		return gpsLng;
	}

	public void setGpsLng(double gpsLng) {
		this.gpsLng = gpsLng;
	}

	public String getBusinessPhone1() {
		return businessPhone1;
	}

	public void setBusinessPhone1(String businessPhone1) {
		this.businessPhone1 = businessPhone1;
	}

	public String getBusinessPhone2() {
		return businessPhone2;
	}

	public void setBusinessPhone2(String businessPhone2) {
		this.businessPhone2 = businessPhone2;
	}

	public String getHotline() {
		return hotline;
	}

	public void setHotline(String hotline) {
		this.hotline = hotline;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getFacebookAccount() {
		return facebookAccount;
	}

	public void setFacebookAccount(String facebookAccount) {
		this.facebookAccount = facebookAccount;
	}

	public String getTwitterAccount() {
		return twitterAccount;
	}

	public void setTwitterAccount(String twitterAccount) {
		this.twitterAccount = twitterAccount;
	}

	public double getAverageRatings() {
		return averageRatings;
	}

	public void setAverageRatings(double averageRatings) {
		this.averageRatings = averageRatings;
	}

	public long getTotalReviews() {
		return totalReviews;
	}

	public void setTotalReviews(long totalReviews) {
		this.totalReviews = totalReviews;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public long getPlaceOwner() {
		return placeOwner;
	}

	public void setPlaceOwner(long placeOwner) {
		this.placeOwner = placeOwner;
	}

	public Date getCreationDateTime() {
		return creationDateTime;
	}

	public void setCreationDateTime(Date creationDateTime) {
		this.creationDateTime = creationDateTime;
	}

	public long getHasParent() {
		return hasParent;
	}

	public void setHasParent(long hasParent) {
		this.hasParent = hasParent;
	}

	public short getHasChild() {
		return hasChild;
	}

	public void setHasChild(short hasChild) {
		this.hasChild = hasChild;
	}

	public long getLikes() {
		return likes;
	}

	public void setLikes(long likes) {
		this.likes = likes;
	}

	public String getDefaultBigPic() {
		return defaultBigPic;
	}

	public void setDefaultBigPic(String defaultBigPic) {
		this.defaultBigPic = defaultBigPic;
	}

	public String getDefaultSmallPic() {
		return defaultSmallPic;
	}

	public void setDefaultSmallPic(String defaultSmallPic) {
		this.defaultSmallPic = defaultSmallPic;
	}

	public int getCurrentDistinctionLevel() {
		return currentDistinctionLevel;
	}

	public void setCurrentDistinctionLevel(int currentDistinctionLevel) {
		this.currentDistinctionLevel = currentDistinctionLevel;
	}

	public String getOthers() {
		return others;
	}

	public void setOthers(String others) {
		this.others = others;
	}

	public BlogsEntry getBlog() {
		return blog;
	}

	public void setBlog(BlogsEntry blog) {
		this.blog = blog;
	}

	public List<PlacesAddress> getAddress() {
		return address;
	}

	public void setAddress(List<PlacesAddress> address) {
		this.address = address;
	}

	public long getPlaceId() {
		return placeId;
	}

	public List<Activities> getActivities() {
		return activities;
	}

	public void setActivities(List<Activities> activities) {
		this.activities = activities;
	}

	
	
}
