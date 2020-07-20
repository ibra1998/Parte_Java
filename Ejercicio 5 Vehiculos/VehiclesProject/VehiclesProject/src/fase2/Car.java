package fase2;

import java.util.List;

//import java.io.*;
public class Car extends Vehicle{

	//Constructor, which depends only on the variables of the class super (vehicle)
	public Car(String plate, String brand, String color) throws Except{
		super(plate, brand, color);
	}

	//In order to add wheels objects to the car, if there is two lists of wheels objects, each one of them  must have two wheels
	public void addWheels(List<Wheel> frontWheels, List<Wheel> backWheels) throws Except {
		addTwoWheels(frontWheels);//we call the method addTwoWheels because we add two by two wheels
		addTwoWheels(backWheels);
	}

	public void addTwoWheels(List<Wheel> wheels) throws Except {
		if (wheels.size() != 2) {
			throw new Except("Se deben introducir dos ruedas");//We want throw an exception if there isn't two wheels
		}

		Wheel rightWheel = wheels.get(0);//We get every object and add it to wheels list
		Wheel leftWheel = wheels.get(1);

		if (!rightWheel.equals(leftWheel)) {
			throw new Except("La rueda de la derecha debe ser igual a la de la izquierda");//Both wheels must have the same characteristics
		}

		this.wheels.add(leftWheel);
		this.wheels.add(rightWheel);
	}

}
