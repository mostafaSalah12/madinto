package com.platformhouse.allegypt.model.users;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class UserAccount {
	
	
	@Column(length = 75)
	private String uuid;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long userId;
	@Column(columnDefinition="DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;
	@Column(columnDefinition="DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date modifiedDate;
	@Column(length = 75)
	private String password;
	@Column(length = 4)
	private short passwordEncrypted;
	@Column(length = 4)
	private short passwordReset;
	@Column(columnDefinition="DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date passwordModifiedDate;
	@Column(length = 255)
	private String digest;
	@Column(length = 75)
	private String screenName;
	@Column(length = 75)
	private String emailAddress;
	@Column(length = 20)
	private long facebookId;
	@Column(length = 20)
	private long googleId;
	@Column(length = 75)
	private String firstName;
	@Column(length = 75)
	private String lastName;
	@Column(columnDefinition="DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date loginDate;
	@Column(length = 75)
	private String loginIP;
	@Column(columnDefinition="DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastLoginDate;
	@Column(length = 75)
	private String lastLoginIP;
	@Column(columnDefinition="DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastFailedLoginDate;
	@Column(length = 11)
	private int failedLoginAttempts;
	@Column(length = 4)
	private  short lockout;
	@Column(columnDefinition="DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date lockoutDate;
	@Column(length = 4)
	private short agreedToTermsOfUse;
	@Column(length = 4)
	private short emailAddressVerified;
	@Column(length = 11)
	private int status;
	private String profileThumbnail;
	private String profilePicture;
	@Column(length = 1)
	private short activated;
	@Column(length = 11)
	private int type;
	@Column(length = 50)
	private String activationCode;
	@Column(columnDefinition="DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date activationDateTime;
	@Column(length = 20)
	private String mobileNumber;
	@Column(length = 20)
	private String mobileVerificationCode;
	@Column(length = 1)
	private short verified;
	@Column(length = 1)
	private short identified;
	@Column(length = 1)
	private short frozen;
	@Column(length = 1)
	private char gender;
	@ManyToOne
	@JoinColumn(name="user_role_fk")
	private UserRole userRole;
	
	public UserAccount(){}


	public UserAccount(Date createDate, String password, String emailAddress, String firstName,
			String lastName, Date loginDate, String loginIP, int status, String profileThumbnail, String profilePicture,
			short activated, int type, String mobileNumber, char gender, UserRole userRole) {
		
		this.uuid = UUID.randomUUID().toString();
		this.createDate = createDate;
		this.password = password;
		this.emailAddress = emailAddress;
		this.firstName = firstName;
		this.lastName = lastName;
		this.loginDate = loginDate;
		this.loginIP = loginIP;
		this.status = status;
		this.profileThumbnail = profileThumbnail;
		this.profilePicture = profilePicture;
		this.activated = activated;
		this.type = type;
		this.mobileNumber = mobileNumber;
		this.gender = gender;
		this.userRole = userRole;
	}








	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public short getPasswordEncrypted() {
		return passwordEncrypted;
	}

	public void setPasswordEncrypted(short passwordEncrypted) {
		this.passwordEncrypted = passwordEncrypted;
	}

	public short getPasswordReset() {
		return passwordReset;
	}

	public void setPasswordReset(short passwordReset) {
		this.passwordReset = passwordReset;
	}

	public Date getPasswordModifiedDate() {
		return passwordModifiedDate;
	}

	public void setPasswordModifiedDate(Date passwordModifiedDate) {
		this.passwordModifiedDate = passwordModifiedDate;
	}

	public String getDigest() {
		return digest;
	}

	public void setDigest(String digest) {
		this.digest = digest;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public long getFacebookId() {
		return facebookId;
	}

	public void setFacebookId(long facebookId) {
		this.facebookId = facebookId;
	}

	public long getGoogleId() {
		return googleId;
	}

	public void setGoogleId(long googleId) {
		this.googleId = googleId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getLoginDate() {
		return loginDate;
	}

	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}

	public String getLoginIP() {
		return loginIP;
	}

	public void setLoginIP(String loginIP) {
		this.loginIP = loginIP;
	}

	public Date getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	public String getLastLoginIP() {
		return lastLoginIP;
	}

	public void setLastLoginIP(String lastLoginIP) {
		this.lastLoginIP = lastLoginIP;
	}

	public Date getLastFailedLoginDate() {
		return lastFailedLoginDate;
	}

	public void setLastFailedLoginDate(Date lastFailedLoginDate) {
		this.lastFailedLoginDate = lastFailedLoginDate;
	}

	public int getFailedLoginAttempts() {
		return failedLoginAttempts;
	}

	public void setFailedLoginAttempts(int failedLoginAttempts) {
		this.failedLoginAttempts = failedLoginAttempts;
	}

	public short getLockout() {
		return lockout;
	}

	public void setLockout(short lockout) {
		this.lockout = lockout;
	}

	public Date getLockoutDate() {
		return lockoutDate;
	}

	public void setLockoutDate(Date lockoutDate) {
		this.lockoutDate = lockoutDate;
	}

	public short getAgreedToTermsOfUse() {
		return agreedToTermsOfUse;
	}

	public void setAgreedToTermsOfUse(short agreedToTermsOfUse) {
		this.agreedToTermsOfUse = agreedToTermsOfUse;
	}

	public short getEmailAddressVerified() {
		return emailAddressVerified;
	}

	public void setEmailAddressVerified(short emailAddressVerified) {
		this.emailAddressVerified = emailAddressVerified;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getProfileThumbnail() {
		return profileThumbnail;
	}

	public void setProfileThumbnail(String profileThumbnail) {
		this.profileThumbnail = profileThumbnail;
	}

	public String getProfilePicture() {
		return profilePicture;
	}

	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}

	public short getActivated() {
		return activated;
	}

	public void setActivated(short activated) {
		this.activated = activated;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getActivationCode() {
		return activationCode;
	}

	public void setActivationCode(String activationCode) {
		this.activationCode = activationCode;
	}

	public Date getActivationDateTime() {
		return activationDateTime;
	}

	public void setActivationDateTime(Date activationDateTime) {
		this.activationDateTime = activationDateTime;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getMobileVerificationCode() {
		return mobileVerificationCode;
	}

	public void setMobileVerificationCode(String mobileVerificationCode) {
		this.mobileVerificationCode = mobileVerificationCode;
	}

	public short getVerified() {
		return verified;
	}

	public void setVerified(short verified) {
		this.verified = verified;
	}

	public short getIdentified() {
		return identified;
	}

	public void setIdentified(short identified) {
		this.identified = identified;
	}

	public short getFrozen() {
		return frozen;
	}

	public void setFrozen(short frozen) {
		this.frozen = frozen;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public UserRole getUserRole() {
		return userRole;
	}

	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
	}

	public long getUserId() {
		return userId;
	}
	
	
	

}
