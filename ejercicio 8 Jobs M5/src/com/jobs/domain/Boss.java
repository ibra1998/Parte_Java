package com.jobs.domain;

import com.jobs.application.PaymentFactory;

public class Boss extends Employee {//This class is used to create Boss objects for the company
	//All its attributes are already in the Employee superclass, and its constructor just call the superclass Employee
	//It introduces the IPaymentRate class where we have defined how we pay him
	public Boss(String name, String address, String phone, double salaryPerMonth) throws Exception {
		super(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateBoss());
	}
	

}
