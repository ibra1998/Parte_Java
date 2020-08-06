package com.jobs.application;

import com.jobs.domain.AbsStaffMember;
import com.jobs.domain.Employee;
import com.jobs.domain.Volunteer;
import com.jobs.persistence.EmployeeRepository;
import com.jobs.domain.Boss;
import com.jobs.domain.Manager;
import com.jobs.domain.NormalEmployee;

public class JobsController {//In this class, we store the routines we are going to make
	//We will have to create a routine to create a staff member (one for each type): for a boss, a normal employee, a manager and a volunteer

	private EmployeeRepository repository = new EmployeeRepository();//It creates an object from class EmloyeeRepository (which is abstract)
	
	public JobsController(){//This is the constructor of this class, it's not needed really
		
	}
	
	//This method calls the constructor of Employee to create a boss object from class Employee and give its corresponging values
	public void createBossEmployee(String name, String address, String phone, double salaryPerMonth) {
		try {//We use the try catch structure as this could throw an Exception
			Employee boss = new Boss(name, address, phone,  salaryPerMonth);
			repository.addMember(boss);//We add the boss to our list
		}catch(NullPointerException e) {
			System.out.println("No se ha podido añadir el jefe porque hay algun campo vacio");
		}catch(Exception e) {}
	}
	
	//This method does the same as the one before, but pays differently because it's an employee.
	public void createEmployee(String name, String address, String phone, double salaryPerMonth) {		
		try {
			Employee employee = new NormalEmployee(name, address, phone,  salaryPerMonth);
			repository.addMember(employee);
		}catch(NullPointerException e) {
			System.out.println("No se ha podido añadir el empleado porque hay algun campo vacio");
		}catch(Exception e) {}
	}


	//We do the same for a manager
	public void createManagerEmployee(String name, String address, String phone, double salaryPerMonth){
		// TODO Auto-generated method stub
		try {
			Employee manager = new Manager(name, address, phone,  salaryPerMonth);
			repository.addMember(manager);
		}catch(NullPointerException e) {
			System.out.println("No se ha podido añadir el manager porque hay algun campo vacio");
		}catch (Exception e) {}
		
	}
	
	//We do the same for a volunteer,
	public void createVolunteer(String name, String address, String phone, String tasks) {
		// TODO Auto-generated method stub
		try {
			Volunteer voluntario = new Volunteer(name, address, phone, tasks);
			repository.addMember(voluntario);
		}catch (Exception e) {
			System.out.println("No se ha podido añadir el voluntario a la base de datos");
		}
	}


	public void payAllEmployeers() {//Este método solo paga a los jefes, Boss 
		// TODO Auto-generated method stub
		//We show a message that explains what are we doing
		System.out.println("Se están pagando los jefes");
		double totalPagado = 0;//We want to calculate the amount used to pay all the bosses
		int numberOfBosses = 0;//We want to count bosses
		for (AbsStaffMember staff : repository.getAllMembers()) {//We loop over our list of staff
			if (staff instanceof Boss) {//We check if this member is a boss
				Boss boss = (Boss) staff;//If so we convert it in a boss to use its methods
				staff.pay();//We pay him
				totalPagado =totalPagado + boss.getPaymentRate().pay(boss.getSalaryPerMonth());//We add the paid amount to the total
				numberOfBosses++;//We add one to the counter of bosses
			}
		}
		if (numberOfBosses ==0) {//If no boss was found, we print this message
			System.out.println("No hay jefes a los que pagar\n");
		}else {//If there was, we show the amount paid and number of bosses paid
			System.out.println(" Se ha gastado un total de "+ totalPagado + " a " + numberOfBosses +" jefes.");
		}
	
	}

	public String getAllEmployees() {//This method returns a text with the description of our staff list
		// TODO Auto-generated method stub
		String empleadosText = " En esta empresa trabajan las siguientes personas\n";//We create the string we are going to return
		for (AbsStaffMember staff : repository.getAllMembers()) {
			if (staff instanceof Volunteer) {//We print a different text depending on if its a Volunteer, manager, normal employee or a boss
				empleadosText += staff.getName() + " trabaja como voluntario. \n";
			}else if (staff instanceof Boss) {
				empleadosText += staff.getName() + " trabaja jefe en la empresa\n";	
			}else if (staff instanceof Manager) {
				empleadosText += staff.getName() + " trabaja como manager en la empresa\n";
			}else {
				empleadosText += staff.getName() + " trabaja en la empresa\n";
			}
		}
		return empleadosText;//We return the whole text
	}

}
