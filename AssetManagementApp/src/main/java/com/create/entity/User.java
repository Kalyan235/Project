package com.create.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long uId;
	private String userName;
	private String password;
	private String fName;
	private String lName;
	private String email;
	private String phone;
	private String department;
	private Boolean isActive;
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinTable(name="user_role",joinColumns= {@JoinColumn(name="userId")},inverseJoinColumns = {@JoinColumn(name="roleId")})
	private List<Role> roles;

	public User() {
		super();
	}

	public User(Long uId, String userName, String password, String fName, String lName, String email, String phone,
			String department, Boolean isActive) {
		super();
		this.uId = uId;
		this.userName = userName;
		this.password = password;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.phone = phone;
		this.department = department;
		this.isActive = isActive;
	}

	public Long getuId() {
		return uId;
	}

	public void setuId(Long uId) {
		this.uId = uId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "User [uId=" + uId + ", userName=" + userName + ", password=" + password + ", fName=" + fName
				+ ", lName=" + lName + ", email=" + email + ", phone=" + phone + ", department=" + department
				+ ", isActive=" + isActive + "]";
	}

}
