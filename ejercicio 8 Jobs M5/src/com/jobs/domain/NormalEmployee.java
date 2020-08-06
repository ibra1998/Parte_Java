package com.jobs.domain;

import com.jobs.application.PaymentFactory;

public class NormalEmployee extends Employee {//This class is for the normal employees of the company
	//This class just has one constructor and all its characteristics now are inherited from the superclass (employee)
	//It introduces the IPaymentRate class where we have defined how we pay him
	public NormalEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception {
		super(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateEmployee());
	}

}
