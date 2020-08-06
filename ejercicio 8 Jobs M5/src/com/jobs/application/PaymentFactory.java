package com.jobs.application;

import com.jobs.domain.IPaymentRate;

public class PaymentFactory {

	//This class stores IPaymentRate classes that implement the pay method
	
	//Payment method for a Boss
	public static IPaymentRate createPaymentRateBoss(){
		return new IPaymentRate() {	//It returns a inner class object that defines the pay method
			@Override
			public double pay(double salaryPerMonth) {//This method receives a double input and returns it with a 50% increase
				return salaryPerMonth*1.5;//It returns 50% the given salary
			}
		};
	}
	
	//Payment method for a employee
	public static IPaymentRate createPaymentRateEmployee(){
		return new IPaymentRate() {//It returns a inner class
			@Override
			public double pay(double salaryPerMonth) {
				return ((1-0.15)* salaryPerMonth);//his salary is 15% less than its salary
			}
		};
	}
	

	//Payment method for a Manager
	public static IPaymentRate createPaymentRateManager(){
		return new IPaymentRate() {//It returns a inner class that defines its pay method
			@Override
			public double pay(double salaryPerMonth) {
				return (1.1* salaryPerMonth);	//The salary of Manager is 10% more than its salary
			}
		};
	}
	
	//Payment method for a Volunteer. This method is not needed in the actual program
	public static IPaymentRate createPaymentRateVolunteer(){
		return new IPaymentRate() {//It returns a inner class that defines its pay method
			@Override
			public double pay(double salaryPerMonth) {
				return (0* salaryPerMonth);	//Volunteers are not paid
			}
		};
	}
	
}
