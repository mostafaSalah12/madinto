package com.platformhouse.allegypt.model.places;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.platformhouse.allegypt.model.users.UserAccount;

@Entity
public class PlaceLikes {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@ManyToOne
	@JoinColumn(name="placelikes_fk")
	private PlaceDetails place;
	@ManyToOne
	@JoinColumn(name="userlikes_fk")
	private UserAccount user;
	@Column(length = 1)
	private short likesStatus;
	
public	PlaceLikes(){}

}
