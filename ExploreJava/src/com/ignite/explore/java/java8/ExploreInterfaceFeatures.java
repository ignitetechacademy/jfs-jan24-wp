package com.ignite.explore.java.java8;

public class ExploreInterfaceFeatures {

	public static void main(String[] args) {
		Data dt = new CompanyData();
		dt.initialData();

		Data.readData();
		
		Data newData = () -> {
			System.out.println("Coonect to API and fetch data");
		};
		newData.fetchDataFromExternalSource();
	}
}

interface Data {
	default void initialData() {
		System.out.println("This is an implemented method in the interface");
	}
	
	static void readData() {
		System.out.println("Read data from the Disk");
	}
	
	void fetchDataFromExternalSource();
}

class CompanyData implements Data {

	@Override
	public void fetchDataFromExternalSource() {
		// TODO Auto-generated method stub
		
	}

}
