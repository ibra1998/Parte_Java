package com.jobs.domain;

import com.jobs.application.PaymentFactory;

public class Manager extends Employee{//This class is used to create Manager objects for the company
	//It introduces the IPaymentRate class where we have defined how we pay him
	public Manager(String name, String address, String phone, double salaryPerMonth) throws Exception {
		super(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateManager());
	}
	

}
