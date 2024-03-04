package com.ignite.explore.layers.hospitality;

public class GuestDAO {

	// GNR : Guest Name Record
	void generateGNRNumber(Guest guest) {
		System.out.println("GuestDAO.generateGNRNumber()");
		
		int gnrNumber = (int) (Math.random() * 100000);
		System.out.println("GNR for booking : " + gnrNumber);
		
		guest.setGeneratedGNRNumber(gnrNumber);
	}
}
