package fase1;

public class Wheel {
	//properties of the class wheel
	private String brand;
	private double diameter;

	//The only constructor
	public Wheel(String brand, double diameter) {
		this.brand = brand;
		this.diameter = diameter;
	}
	//I create two getters for this, as there is an error of Wheel.brand is not used and Wheel.diameter is not used
	String getBrand() {
		return brand;
	}
	double getDiameter() {
		return diameter;
	}
}
