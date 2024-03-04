package com.ignite.explore.layers.hospitality;

import java.util.Arrays;
import java.util.List;

public class StandardGuestService implements GuestServiceInteface{

	static List<String> rooms = Arrays.asList("First Floor - 103", "First Floor - 105", "Second Floor - 203",
			"Second Floor - 205", "Third Floor - 303", "Third Floor - 305");
	
	GuestDAO dao = new GuestDAO();

	public void allotRoom(Guest guest) {
		System.out.println("GuestService.allotRoom()");

		int randomRoomNumber = (int) (Math.random() * 6);
		String roomNo = rooms.get(randomRoomNumber);
		System.out.println("Allotted Room : " + roomNo);
		
		guest.setAllotedRoom(roomNo);
		
		dao.generateGNRNumber(guest);

	}
}
