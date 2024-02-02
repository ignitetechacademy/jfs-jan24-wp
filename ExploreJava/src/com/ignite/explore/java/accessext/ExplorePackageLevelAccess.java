package com.ignite.explore.java.accessext;

import com.ignite.explore.java.access.Calculations;

public class ExplorePackageLevelAccess {

	public static void main(String[] args) {
	
		Calculations calc = new Calculations();
		calc.sub(0, 0);

		
		ScientificCalculations scalc = new ScientificCalculations();
		scalc.mul(20, 40);
		scalc.sub(100, 300);

	}

}

class ScientificCalculations extends Calculations{
	@Override
	protected int mul(int first, int second) {
		return super.mul(first, second);
	}
}
