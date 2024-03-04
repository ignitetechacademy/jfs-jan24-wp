package com.ignite.explore.layers.hospitality;

import java.util.Arrays;
import java.util.List;

public class SpecialGuestService implements GuestServiceInteface {
	
	static List<String> rooms = Arrays.asList("First Block - Suite A", "First Block - Suite B", "Second Block - Suite A",
			"Second Block - Suite B", "Third Block - Suite A", "First Block - Suite B");
	
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
