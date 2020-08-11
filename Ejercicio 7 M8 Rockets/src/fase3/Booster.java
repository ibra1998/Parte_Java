package fase3;

public class Booster extends Thread{
	private double maximumPower;//This indicates the maximum power a rocket has
	private double actualPower;
	//The basic constructor gives assign the maximum power to its attribute
	public Booster(double maximumPower) {
		this.maximumPower = maximumPower;
		this.actualPower = 0;
	}
	
	//Getter & setter for maximumPwer
	public double getmaximumPower() {
		return this.maximumPower;
	}
	public void setMaximumPower(double maximumPower) {
		this.maximumPower = maximumPower;
	}
	public double getActualPower() {
		return this.actualPower;
	}
	
	//Accelerate method: this method increases the power of this booster until it achieves a certain power
	public void accelerate(double objectivePower) {
		//The objective power must be less than the maximum, if not, we will achieve the maximumPower
		if (objectivePower> this.maximumPower) objectivePower = this.maximumPower;
		System.out.println(this.getName() + ": Se va a acelerar el propulsor de potencia máxima "
				+ this.maximumPower + " desde " + this.actualPower + " hasta " + objectivePower);
		while(this.actualPower < objectivePower) {
			this.actualPower += 2;//If we didn't reach the power we want, we keep adding power
			//We should accelerate slowly, we we should wait between the accelerations
			try {//here we wait for 20 ms to not accelerate too fast
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//If we have a greater value than the objective, we change the actualPower to the objective
			if (this.actualPower > objectivePower) this.actualPower = objectivePower;
			//We indicate what are we doing
			System.out.println(this.getName() + ": Acelerando propulsor de potencia máxima " + this.maximumPower
					+": velocidad actual = " + this.actualPower+ ", subiendo");
		}
		System.out.println(this.getName() + ": Se ha alcanzado potencia objetivo de " + objectivePower);
	}

	//This method makes the booster's actual power decrease until an objective power
	public void decelerate(double objectivePower) {
		//The objective power must be less than the maximum, if not, we will achieve the maximumPower
		if (objectivePower> this.maximumPower) objectivePower = this.maximumPower;
		System.out.println(this.getName()
				+": Se va a desacelerar el propulsor de potencia máxima "
				+ this.maximumPower + " desde " + this.actualPower + " hasta " + objectivePower);
		while(this.actualPower > objectivePower) {
			this.actualPower -= 2;//If we didn't reach the power we want, we keep adding power
			//We should accelerate slowly, we we should wait between the accelerations
			try {//here we wait for 20 ms to not accelerate too fast
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			//If we have a lower value than the objective, we change the actualPower to the objective
			if (this.actualPower < objectivePower) this.actualPower = objectivePower;
			//We print what we are doing
			System.out.println(this.getName()
					+": Desacelerando propulsor de potencia máxima " + this.maximumPower
					+": velocidad actual = " + this.actualPower);
		}
		System.out.println(this.getName()+
				": Se ha alcanzado potencia objetivo de " + objectivePower);//We say that we finished the process
	}
	
	public void run() {
		this.accelerate(35);//This will make all boosters reach 35 or maximumPower, whichever is greater
		this.decelerate(20);//This will make all boosters reach 20 or maximumPower, whichever is smaller
		
	}
}
