package com.ignite.explore.layers.hospitality;

import java.util.Arrays;
import java.util.List;

public class GuestManagement {

	public static void main(String[] args) {

		// input to the program  - java program / HTML (JSP)
		String guestName = "Syam Kakumani";
		int guestContact = 123;

		// controller (receive & pass data to the caller), service (add data / update data), DAO
		// use layered architecture to allot room & generate PNR number
		GuestController guestControl = new GuestController();
		Guest guestData = guestControl.reserveRoom(guestName, guestContact);

		System.out.println("Room ("+guestData.getAllotedRoom()+") GNR ("+guestData.getGeneratedGNRNumber()+")");
		
		
	}
}
