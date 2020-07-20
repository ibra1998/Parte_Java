package fase3;
import java.util.*;

public class Bike extends Vehicle {

	public Bike(String plate, String brand, String color) throws Except{
		super(plate, brand, color);
	}
	public void addWheels(List<Wheel> wheels) throws Except {
		if (wheels.size() != 2) {
			throw new Except("Las motos tienen dos ruedas");//We want throw an exception if there isn't two wheels
		}
		addFrontWheel(wheels.get(0));
		addBackWheel(wheels.get(1));
	}
	public void addFrontWheel(Wheel frontWheel) {
		this.wheels.add(frontWheel);
	}
	public void addBackWheel(Wheel backWheel){
		this.wheels.add(backWheel);
	}

}
