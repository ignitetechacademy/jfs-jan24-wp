package com.ignite.explore.servlets.companies;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataManagement {

	static Map<Integer, Company> companiesMap = new HashMap<>();

	static void createCompany(Company company) {
		companiesMap.put(company.getId(), company);
		System.out.println("Company Data : " + companiesMap);
	}

	static Collection<Company> retrieveCompanies() {
		return companiesMap.values();
	}

	static Company getCompany(int companyId) {
		Company retrievedCompany = companiesMap.get(companyId);
		return retrievedCompany;
	}
	
	static void updateCompany(int companyId, String ceoName){
		Company companyToUpdate =  companiesMap.get(companyId);
		companyToUpdate.setCeo(ceoName);
		
		companiesMap.put(companyId, companyToUpdate);
	}
}
