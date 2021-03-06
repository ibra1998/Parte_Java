package fase1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fase1 {
	static void ejecutar(){
		Scanner input = new Scanner(System.in);//We create object input to introduce data
		System.out.println("introduczca la marca del coche");
		String brand = input.nextLine();
		System.out.println("Introduzca la matrícula del coche");
		String plate = input.nextLine();
		System.out.println("Introduzca el color del coche");
		String color = input.nextLine();
		//We create an object firstCar from Car class
		
		Car firstCar = new Car(plate,brand, color);

		//Fase 1, part 3
		
		System.out.println("Introduzca la marca de las ruedas de delante");
		String brandWheel = input.nextLine();
		System.out.println("Introduzca el diametro de las ruedas traseras");
		double diameterWheel = Double.parseDouble( input.nextLine());
		//We create the wheels objects, 
		List<Wheel> backWheels = new ArrayList<Wheel>();//We create a list of wheels objects
		Wheel myBackWheel =new Wheel(brandWheel, diameterWheel); 
		backWheels.add(myBackWheel);//we add two wheels of the same characteristics to a list of wheels
		backWheels.add(myBackWheel);
		
		//To check that everything is correct, I call the getters of class Vehicle
		System.out.println("Matricula: " + firstCar.getPlate()+" color: " +
		firstCar.getColor() + " marca: " + firstCar.getBrand() + " ruedas: " + firstCar.getWheels());
		//As the next statement could return an exception, I have to use a try & catch syntax
		try {
			 firstCar.addTwoWheels(backWheels);//we add two wheels in firstWheels to fistCar
	     } catch (Except ex) {
	            System.err.print(ex);
	     }
		//Fase 1, part 4
		//We ask the information we need from the console, and use the same code as above for front Wheels
		System.out.println("Introduzca la marca de las ruedas de delante");
		brandWheel = input.nextLine();
		System.out.println("Introduzca el diametro de las ruedas delanteras");
		diameterWheel = Double.parseDouble( input.nextLine());
		List<Wheel> frontWheels = new ArrayList<Wheel>();//We create a list of wheels objects
		Wheel myFrontWheel = new Wheel(brandWheel, diameterWheel);
		frontWheels.add(myFrontWheel);//we add two wheels of the same characteristics to a list of wheels
		frontWheels.add(myFrontWheel);
		try {
			 firstCar.addTwoWheels(frontWheels);//we add two wheels in firstWheels to fistCar
	     } catch (Except ex) {
	            System.err.print(ex);
	     }	
		//We need to close input of scanner class
		input.close();//We need to close input of scanner class
	}
		

}
