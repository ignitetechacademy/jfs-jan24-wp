package com.ignite.explore.java.apie;

public class ClassInheritanceDemo {

	public static void main(String[] args) {
		
		PersonalLoan personal = new PersonalLoan();
		System.out.println();
	}

}


class Loan extends Object{
	int borrowerId;
	String loanType;
}

class PersonalLoan extends Loan{
	String conditions;
}

class HomeLoan extends Loan{
	String propertyLocation;
}

class EmployeesHomeLoan extends HomeLoan{}
