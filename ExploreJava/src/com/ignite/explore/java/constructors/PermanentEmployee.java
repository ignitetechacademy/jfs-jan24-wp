package com.ignite.explore.java.constructors;

public class PermanentEmployee extends Employee {
  // 0
	int bonus;

	public int getBonus() {
		return bonus;
	}
							
	public void setBonus(int bonus) {
		this.bonus  = bonus;
	}

	@Override
	public String toString() {
		return "PermanentEmployee [bonus=" + bonus + ", name=" + name + ", department=" + department + "]";
	}

	public PermanentEmployee(int bonus) {
		super();
		this.bonus = bonus;
	}

	public PermanentEmployee() {
		super();
	}

	public PermanentEmployee(int bonus, String empName) {
		super();
		this.bonus = bonus;
		super.name = empName;
	}	
	
	

}
