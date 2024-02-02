package com.syam.learn.java.clazz;

public class Course {

	// JavaFullStack, Python FullStack, DevOps, CloudComputing

	String name;
	String tutor;

	byte duration;
	int fees;
	
	@Override
	public String toString() {
		return "Course [name=" + name + ", tutor=" + tutor + ", duration=" + duration + ", fees=" + fees + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTutor() {
		return tutor;
	}

	public void setTutor(String tutor) {
		this.tutor = tutor;
	}

	public byte getDuration() {
		return duration;
	}

	public void setDuration(byte duration) {
		this.duration = duration;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

}
