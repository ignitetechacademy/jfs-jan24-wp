package com.ignite.explore.servlets.companies;

public class Company {

	int id;

	String name;
	String ceo;

	public Company(int id, String name, String ceo) {
		super();
		this.id = id;
		this.name = name;
		this.ceo = ceo;
	}
	
	

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", ceo=" + ceo + "]";
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCeo() {
		return ceo;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

}
