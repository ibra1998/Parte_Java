package com.jobs.view;

import com.jobs.application.JobsController;

public class Main {

	
	//The program creates a JobsController object named controller to operate with
	private static JobsController controller=new JobsController(); 
	
	public static void main(String[] args) throws Exception {
		
		//We create one boss, one volunteer, one manager and two normal employees
		controller.createBossEmployee("Pepe Boss", "Direcci贸n molona", "666666666", 100.0);
		controller.createEmployee("Pedro Employee", "Direcci贸n molona 2", "665266666", 40.0);
		controller.createEmployee("Laura Employee", "Direcci贸n molona 3", "625266666", 45.0);
		controller.createVolunteer("Juan Volunteer", "Direcci贸n molona 4", "614266666", 
				"Este voluntario nos ayuda a mejorar la pol韙ica medioambiental de la empresa");
		controller.createManagerEmployee("Pedro Employee", "Direcci贸n molona 2", "665226666", 80.0);
		
		//We pay the employeers (Bosses)
		controller.payAllEmployeers();
		
		//We print the list of employees we have
		String allEmployees=controller.getAllEmployees();
		
		System.out.println("\nEMPLOYEES: " + allEmployees + " \n");
		
	}

}
