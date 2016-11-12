package com.platformhouse.allegypt.model.common;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.platformhouse.allegypt.model.users.UserAccount;

@Entity
public class BlogsEntry {
	
	@Column(length=75)
	private String uuid;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long entryId;
	@ManyToOne
	private UserAccount user;
	@Column(length=75)
	private String username;
	@Column(columnDefinition="DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;
	@Column(columnDefinition="DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date modifiedDate;
	@Column(length=150)
	private String title;
	@Column(length=150)
	private String urlTitle;
	@Column(columnDefinition="TEXT")
	private String description;
	@Column(columnDefinition="TEXT")
	private String content;
	@Column(columnDefinition="DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date displayDate;
	@Column(length=1)
	private int status;
	
	public BlogsEntry(){}

}
