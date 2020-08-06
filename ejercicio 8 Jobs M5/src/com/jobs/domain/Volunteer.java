package com.jobs.domain;

//import com.jobs.application.PaymentFactory;

//The class volunteer is child from AbstaffMember class
public class Volunteer extends AbsStaffMember {
	

	private String description;
	public Volunteer(String name, String address, String phone, String description) throws Exception {
		super(name, address, phone);
		this.description = description;
		//TODO
	}

	
	@Override//We should override the pay abstract method, in this case it just don't do anything
	
	public void pay() {
		//TODO
		System.out.println("Los voluntarios no cobran");	
	}
	
	//A getter and setter for Description attribute
	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
