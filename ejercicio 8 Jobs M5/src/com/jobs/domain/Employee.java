package com.jobs.domain;

//Class employee that inherits from the superclass AbsStaffMember
public abstract class Employee extends AbsStaffMember {

	// The class Employee apart from the superclass attributes (phone, name, adress, id, and TotalPaid) has two attributes
	//The first one is the salaryPerMonth of type double
	protected double salaryPerMonth;
	//The second attribute is an object of type IPaymentRate (but IPaymentRate is an interface)
	protected IPaymentRate paymentRate;	

	//Constructor
	public Employee(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception {
		//We call the super constructor and assign name, address and phone (and id) to the object of type Employee
		super(name, address, phone);		
		if(salaryPerMonth<0) throw new Exception("No ha introducido un salario correcto");//The salary per moth must be a positive number
		if(paymentRate==null) throw new Exception("No ha creado un metodo de pago"); //the paymentRate (from class IPaymentRate) can't be null
				
		this.salaryPerMonth=salaryPerMonth;//We assign the passed parameters to the object attributes
		this.paymentRate=paymentRate;
	}

	
	@Override
	//This method is used when we pay the worker
	public void pay() {//We override the abstract method "pay", as it was not defined in the superclass
		totalPaid+=this.paymentRate.pay(this.salaryPerMonth);//We add to the toalPaid the salary of the employee, modified
		System.out.println(" se ha pagado un total de " + this.totalPaid + " a " + this.name + " de los cuales " +
		this.paymentRate.pay(this.salaryPerMonth)+ " han sido ahora" );
	}
	public IPaymentRate getPaymentRate() {
		return this.paymentRate;//This returns the class that contains the method we use to calculate salary
	}
	public double getSalaryPerMonth() {
		return this.salaryPerMonth;
	}
	
	

}
