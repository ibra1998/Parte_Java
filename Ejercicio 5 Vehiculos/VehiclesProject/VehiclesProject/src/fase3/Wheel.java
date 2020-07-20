package fase3;

public class Wheel {
	//properties of the class wheel
	private String brand;
	private double diameter;

	//The only constructor
	public Wheel(String brand, double diameter) {
		this.brand = brand;
		this.diameter = diameter;
	}
	//We difine a getter for diameter, as we need to call it
	public double getDiameter() {
		return this.diameter;
	}
	public String getBrand() {
		return this.brand;
	}
}
