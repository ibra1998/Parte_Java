package fase1;

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
	public Vehicle(String plate, String brand, String color) {
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
