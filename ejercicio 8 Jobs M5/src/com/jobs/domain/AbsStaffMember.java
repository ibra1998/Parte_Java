package com.jobs.domain;

//The AbsStaffMember class is the superclass for Volunteer and Employee. It's for the people that are part of the company
public abstract class AbsStaffMember {

	//It has 5 object attributes and one class attribute (COUNT_MEMBERS) which counts how many members we have
	protected int id;//A unique id for every person
	protected String name;//name, adress and phone are personal data that we need to store
	protected String address;
	protected String phone;
	protected double totalPaid=0;//By default, no object was paid
	private static int COUNTER_MEMBERS = 1;//This is a class attribute that count number of objects created

	//We have a constructor that only works if no field is Empty
	public AbsStaffMember(String name, String address, String phone) throws Exception {
		
		//We check if name, address or phone (all of them String ) are Empty. If so, we throw an Exception
		if (name.equals(""))
			throw new Exception("No ha escrito el nombre");
		if (address.equals(""))
			throw new Exception("No ha escrito la direccion");
		if (phone.equals(""))
			throw new Exception("No ha escrito un numero de telefono");

		//We assign name, address and phone as attributes for this object
		this.name = name;
		this.address = address;
		this.phone = phone;
		
		//We give the any object from this class an id from outside, which its the number of objects that were created
		id = COUNTER_MEMBERS;
		
		//As we created a new object, we must add it so we must add one to COUNT_MEMBERS
		COUNTER_MEMBERS++;
	}

	
	
	//We have an abstract method that pays, that every child class has to define
	public abstract void pay();
	
	
	//I need a getter for every property
	
	//name
	public String getName() {
		return this.name;
	}
	
	//adress
	public String getAdress() {
		return this.address;
	}
	
	//id
	public int getId() {
		return this.id;
	}
	
	//phone
	public String getPhone() {
		return this.phone;
	}
	
	//totalPaid
	public double getTotalPaid() {
		return this.totalPaid;
	}
	
	//COUNT_MEMBERS
	public static int getNumberOfMembers() {
		return COUNTER_MEMBERS;
	}

}
