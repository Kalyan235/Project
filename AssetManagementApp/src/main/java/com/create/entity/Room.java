package com.create.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Room {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long roomId;
	private String roomName;
	@ManyToOne(cascade =CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="labId")
	private Lab lab;
	@OneToMany(mappedBy = "room")
	private List<Asset> assets;

	public Room() {
		super();
	}

	public Room(Long roomId, String roomName) {
		super();
		this.roomId = roomId;
		this.roomName = roomName;
	}

	public Long getRoomId() {
		return roomId;
	}

	public void setRoomId(Long roomId) {
		this.roomId = roomId;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	@Override
	public String toString() {
		return "Room [roomId=" + roomId + ", roomName=" + roomName + "]";
	}

}
