package com.capgemini.assetmgmt.dtos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="User_Master")
@Table(name="User_Master")
public class User implements Serializable{

	private static final long serialVersionUID = -4398853708793284444L;
	
	@Id
	@Column(name="userId")
	private int userId;
	
	@Column(name="userName")
	private String userName;
	
	@Column(name="userPassword")
	private String userPassword;
	
	@Enumerated(EnumType.STRING)
	@Column(name="userType")
	private UserType userType;
	
	public User() {
		super();
	}

	public User(int userId, String userName, String userPassword,
			UserType userType) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userType = userType;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName
				+ ", userPassword=" + userPassword + ", userType=" + userType
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + userId;
		result = prime * result
				+ ((userName == null) ? 0 : userName.hashCode());
		result = prime * result
				+ ((userPassword == null) ? 0 : userPassword.hashCode());
		result = prime * result
				+ ((userType == null) ? 0 : userType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (userId != other.userId)
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		if (userPassword == null) {
			if (other.userPassword != null)
				return false;
		} else if (!userPassword.equals(other.userPassword))
			return false;
		if (userType != other.userType)
			return false;
		return true;
	}

	
}
