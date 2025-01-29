package com.PractiseApi.entity;


public class Cars {
	
	private long id;
	
	private String color;
	
	private String Company;
	
	public void setId(long id) {
		
		this.id = id;
	}
	
	public Long getId() {
		
		return id;
	}
	
	public void setColor( String color) {
		
		this.color = color;
	}
	
	public String getColor() {
		
		return color;
	}
	
	public void  setCompany(String Company) {
		
		this.Company = Company;
	}
	
	public String getCompany() {
		
	     return Company;	
	}

}
