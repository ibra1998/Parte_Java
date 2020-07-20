package fase3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fase3 {
	static void ejecutar() {//The same code as in fase2
		Scanner input = new Scanner(System.in);//We create object input to introduce data
		System.out.println("Elija qué tipo de vehículo quiere: \n1 coche\n2 moto");
		String typeVehicle = input.nextLine();
		//Case car
		if (typeVehicle.equals("1") || typeVehicle.equals("coche")) {
			//All this code is similar to Fase2, until the next if
			//We ask for the data we need
			System.out.println("introduczca la marca del coche");
			String brand = input.nextLine();
			System.out.println("Introduzca la matrícula del coche");
			String plate = input.nextLine();
			System.out.println("Introduzca el color del coche");
			String color = input.nextLine();
			//We create an object firstCar from Car class
			try {//this code executes if the plate has a correct format
				Car firstCar = new Car(plate,brand, color);//We create the car
	
				//Fase 1, part 3
	
				System.out.println("Introduzca la marca de las ruedas de atrás");
				String brandWheel = input.nextLine();
				boolean correctDiameter;//Here we save if the diameter of the wheel is correct
				double diameterWheel;
				do {
					System.out.println("Introduzca el diametro de las ruedas atrás");
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
				
				//To check that everything is correct, I call the getters of class Vehicle
				System.out.println("Matricula: " + firstCar.getPlate()+" color: " +
				firstCar.getColor() + " marca: " + firstCar.getBrand() + " ruedas: ");
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
					System.out.println("Introduzca el diametro de las ruedas atrás");
					diameterWheel = Double.parseDouble(input.nextLine());
					correctDiameter = diameterWheel<4 && diameterWheel>0.4;
					if (!correctDiameter) {
						System.out.println("El diametro debe ser entre 0.4 y 4");//A message that warns if the there was introduced a non valid value
					}
				}while(!correctDiameter);
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
			
			//Case Bike
		}else if (typeVehicle.equals("2") || typeVehicle.equals("moto")) {
			System.out.println("introduczca la marca de la moto");
			String brand = input.nextLine();
			System.out.println("Introduzca la matrícula de la moto");
			String plate = input.nextLine();
			System.out.println("Introduzca el color de la moto");
			String color = input.nextLine();
			//We create an object firstCar from Car class
			try {//this code executes if the plate has a correct format
				Bike firstBike = new Bike(plate,brand, color);
	
				//Fase 1, part 3
				//We add the backWheel
				System.out.println("Introduzca la marca de la rueda de atrás");
				String brandWheel = input.nextLine();
				System.out.println("Introduzca el diametro de las ruedas traseras");
				double diameterWheel = Double.parseDouble(input.nextLine());
				Wheel myBackWheel =new Wheel(brandWheel, diameterWheel); 
				//I have to add the front wheel to the bike
				firstBike.addBackWheel(myBackWheel);
				//To check that everything is correct, I call the getters of class Vehicle
				System.out.println("Matricula: " + firstBike.getPlate()+" color: " +
				firstBike.getColor() + " marca: " + firstBike.getBrand() );
				
				//Fase 1, part 4
				//I have to add now the front Wheel
				System.out.println("Introduzca la marca de la rueda de delante");
				brandWheel = input.nextLine();
				System.out.println("Introduzca el diametro de las ruedas delanteras");
				diameterWheel = Double.parseDouble(input.nextLine());
				Wheel myFrontWheel =new Wheel(brandWheel, diameterWheel); 
				//I have to add the front wheel to the bike
				firstBike.addFrontWheel(myFrontWheel);
				//To check that everything is correct, I call the getters of class Vehicle
				System.out.println("Matricula: " + firstBike.getPlate()+" color: " +
				firstBike.getColor() + " marca: " + firstBike.getBrand() );
				
			}catch (Except ex) {
				System.err.print(ex);
			}			
		}
		input.close();//We need to close input of scanner class
	}
}
