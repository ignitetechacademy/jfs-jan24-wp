package com.ignite.explore.layers.hospitality;

public class GuestController {
	
	// GuestService guestServ = new GuestService();
	// GuestServiceInteface guestServ = new SpecialGuestService();
	GuestServiceInteface guestServ = new StandardGuestService();


	
	Guest reserveRoom(String gName, int gContact) {
		System.out.println("GuestController.reserveRoom()");

		Guest guest = new Guest(gName, gContact);
		System.out.println("Guest (" + guest.getGuestName() + " : " + guest.getGuestContact() + ")");


		guestServ.allotRoom(guest);
		
		return guest;
	}

}
