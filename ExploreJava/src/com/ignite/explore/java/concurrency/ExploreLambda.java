package com.ignite.explore.java.concurrency;

import java.util.ArrayList;
import java.util.List;

public class ExploreLambda {

	public static void main(String[] args) {
		// EmployeeDetails ed = new EmployeeDetails();
		// ed.myDetails();

		Details dtls = new EmployeeDetails();
		dtls.myDetails();

		Details consultantDetails = new Details() {
			@Override
			public void myDetails() {
				System.out.println("Consulatnt - works on certin conditions");
			}
		};
		consultantDetails.myDetails();

		Details freelancerDetails = () -> {
			System.out.println("Freelancers (lambda) - work on their own time");
		};

		freelancerDetails.myDetails();
	}

}

class EmployeeDetails implements Details {

	@Override
	public void myDetails() {
		System.out.println("Employees works for an Organization");
	}
}

interface Details {
	void myDetails();
}
