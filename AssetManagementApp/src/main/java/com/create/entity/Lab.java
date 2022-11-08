package com.create.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Lab {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long labId;
	private String labName;
	private String location;
	private String address;
	@OneToMany(mappedBy = "lab")
	private List<Room> rooms;

	public Lab() {
		super();
	}

	public Lab(Long labId, String labName, String location, String address) {
		super();
		this.labId = labId;
		this.labName = labName;
		this.location = location;
		this.address = address;
	}

	public Long getLabId() {
		return labId;
	}

	public void setLabId(Long labId) {
		this.labId = labId;
	}

	public String getLabName() {
		return labName;
	}

	public void setLabName(String labName) {
		this.labName = labName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Lab [labId=" + labId + ", labName=" + labName + ", location=" + location + ", address=" + address + "]";
	}

}
