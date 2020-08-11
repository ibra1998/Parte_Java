package fase2;

public class Booster {
	private double maximumPower;//This indicates the maximum power a rocket has
	
	//The basic constructor gives assign the maximum power to its attribute
	public Booster(double maximumPower) {
		this.maximumPower = maximumPower;
	}
	
	//Getter & setter for maximumPwer
	public double getmaximumPower() {
		return this.maximumPower;
	}
	public void setMaximumPower(double maximumPower) {
		this.maximumPower = maximumPower;
	}

}
