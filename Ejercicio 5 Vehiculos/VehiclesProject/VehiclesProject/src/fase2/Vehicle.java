package fase2;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {

	//Variables of the superclass vehicle
	protected String plate;
	protected String brand;
	protected String color;
	//this creates an array of objects wheel
	protected List<Wheel> wheels = new ArrayList<Wheel>();

	//the only constructor we have
	public Vehicle(String plate, String brand, String color) throws Except {
		if (!plate.matches("(\\d{4})[a-zA-Z]{2,3}")){
			throw new Except("La matricula debe tener 4 numeros y dos o 3 letras");
		}
		this.plate = plate;
		this.brand = brand;
		this.color = color;
	}
	//getters:
	String getPlate() {
		return plate;
	}
	String getBrand() {
		return brand;
	}
	String getColor() {
		return color;
	}
	List<Wheel> getWheels(){
		return wheels;
	}
	
}
