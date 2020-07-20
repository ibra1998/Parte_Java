package fase2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fase2 {
	static void ejecutar() {
		//We collect the needed data
		Scanner input = new Scanner(System.in);//We create object input to introduce data
		System.out.println("introduczca la marca del coche");
		String brand = input.nextLine();
		System.out.println("Introduzca la matrícula del coche");
		String plate = input.nextLine();
		System.out.println("Introduzca el color del coche");
		String color = input.nextLine();
		//We create an object firstCar from Car class
		try {//this code executes if the plate has a correct format
			Car firstCar = new Car(plate,brand, color);//We create the car
			//now we collect data for the back Wheels
			System.out.println("Introduzca la marca de las ruedas de atrás");
			String brandWheel = input.nextLine();
			boolean correctDiameter;//Here we save if the diameter of the wheel is correct
			double diameterWheel;
			//I create a loop to keep asking for a diameter until it's correct
			do {
				System.out.println("Introduzca el diametro de las ruedas traseras");
				diameterWheel = Double.parseDouble(input.nextLine());
				correctDiameter = diameterWheel<4 && diameterWheel>0.4;
				if (!correctDiameter) {
					System.out.println("El diametro debe ser entre 0.4 y 4");//A message that warns if the there was introduced a non valid value
				}
			}while(!correctDiameter);//It will keep asking untill a valid value is introduced
			//We create the wheels objects, 
			List<Wheel> backWheels = new ArrayList<Wheel>();//We create a list of wheels objects
			Wheel myBackWheel =new Wheel(brandWheel, diameterWheel); 
			backWheels.add(myBackWheel);//we add two wheels of the same characteristics to a list of wheels
			backWheels.add(myBackWheel);
			
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
			do {
				System.out.println("Introduzca el diametro de las ruedas delanteras");
				diameterWheel = Double.parseDouble(input.nextLine());
				correctDiameter = diameterWheel<4 && diameterWheel>0.4;
				if (!correctDiameter) {
					System.out.println("El diametro debe ser entre 0.4 y 4");//A message that warns if the there was introduced a non valid value
				}
			}while(!correctDiameter);//It will keep asking untill a valid value is introduced
			List<Wheel> frontWheels = new ArrayList<Wheel>();//We create a list of wheels objects
			Wheel myFrontWheel = new Wheel(brandWheel, diameterWheel);
			frontWheels.add(myFrontWheel);//we add two wheels of the same characteristics to a list of wheels
			frontWheels.add(myFrontWheel);
			try {
				 firstCar.addTwoWheels(frontWheels);//we add two wheels in firstWheels to fistCar
		     } catch (Except ex) {
		            System.err.print(ex);
		     }	
		}catch (Except ex) {
			System.err.print(ex);
		}
		input.close();//We need to close input of scanner class

	}


}
