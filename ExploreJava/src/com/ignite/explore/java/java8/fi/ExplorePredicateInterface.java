package com.ignite.explore.java.java8.fi;

import java.util.function.Predicate;

public class ExplorePredicateInterface {
	public static void main(String[] args) {
		Predicate<Integer> checkAge = (Integer age) -> { return age >= 18; };
		System.out.println("Elgible for Driving License : "+checkAge.test(18));
		
		Voters checkEligibility = (int voterAge) -> { return voterAge >= 21;};
		System.out.println("Eligible for Voting : "+checkEligibility.check(22));
		
		VotersImpl vImpl = new VotersImpl();
		System.out.println(vImpl);
		
		System.out.println("-------");
		System.out.println(checkAge);
		System.out.println(checkEligibility);
	}
}


interface Voters{
	boolean check(int voterAge);
}

class VotersImpl implements Voters{

	@Override
	public boolean check(int voterAge) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
