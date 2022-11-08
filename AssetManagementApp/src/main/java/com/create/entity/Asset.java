package com.create.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Asset {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long assetId;
	private String rfidTag;
	private String assetTag;
	private String serialNumber;
	private String description;
	private String frindlyName;
	private String model;
	private String manufacturing;
	private Date date;
	private Double cost;
	private String primaryContact;
	private String secondryContaxt;
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="roomId")
	private Room rooms;

	public Asset() {
		super();
	}

	public Asset(Long assetId, String rfidTag, String assetTag, String serialNumber, String description,
			String frindlyName, String model, String manufacturing, Date date, Double cost, String primaryContact,
			String secondryContaxt) {
		super();
		this.assetId = assetId;
		this.rfidTag = rfidTag;
		this.assetTag = assetTag;
		this.serialNumber = serialNumber;
		this.description = description;
		this.frindlyName = frindlyName;
		this.model = model;
		this.manufacturing = manufacturing;
		this.date = date;
		this.cost = cost;
		this.primaryContact = primaryContact;
		this.secondryContaxt = secondryContaxt;
	}

	public Long getAssetId() {
		return assetId;
	}

	public void setAssetId(Long assetId) {
		this.assetId = assetId;
	}

	public String getRfidTag() {
		return rfidTag;
	}

	public void setRfidTag(String rfidTag) {
		this.rfidTag = rfidTag;
	}

	public String getAssetTag() {
		return assetTag;
	}

	public void setAssetTag(String assetTag) {
		this.assetTag = assetTag;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFrindlyName() {
		return frindlyName;
	}

	public void setFrindlyName(String frindlyName) {
		this.frindlyName = frindlyName;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getManufacturing() {
		return manufacturing;
	}

	public void setManufacturing(String manufacturing) {
		this.manufacturing = manufacturing;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public String getPrimaryContact() {
		return primaryContact;
	}

	public void setPrimaryContact(String primaryContact) {
		this.primaryContact = primaryContact;
	}

	public String getSecondryContaxt() {
		return secondryContaxt;
	}

	public void setSecondryContaxt(String secondryContaxt) {
		this.secondryContaxt = secondryContaxt;
	}

	@Override
	public String toString() {
		return "Asset [assetId=" + assetId + ", rfidTag=" + rfidTag + ", assetTag=" + assetTag + ", serialNumber="
				+ serialNumber + ", description=" + description + ", frindlyName=" + frindlyName + ", model=" + model
				+ ", manufacturing=" + manufacturing + ", date=" + date + ", cost=" + cost + ", primaryContact="
				+ primaryContact + ", secondryContaxt=" + secondryContaxt + "]";
	}

}
