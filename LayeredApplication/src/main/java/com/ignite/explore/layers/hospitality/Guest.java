package com.ignite.explore.layers.hospitality;

public class Guest {

	String guestName;
	int guestContact;

	String allotedRoom;
	int generatedGNRNumber;

	public Guest(String guestName, int guestContact) {
		super();
		this.guestName = guestName;
		this.guestContact = guestContact;
	}

	public String getGuestName() {
		return guestName;
	}

	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}

	public int getGuestContact() {
		return guestContact;
	}

	public void setGuestContact(int guestContact) {
		this.guestContact = guestContact;
	}

	public String getAllotedRoom() {
		return allotedRoom;
	}

	public void setAllotedRoom(String allotedRoom) {
		this.allotedRoom = allotedRoom;
	}

	public int getGeneratedGNRNumber() {
		return generatedGNRNumber;
	}

	public void setGeneratedGNRNumber(int generatedGNRNumber) {
		this.generatedGNRNumber = generatedGNRNumber;
	}

}
