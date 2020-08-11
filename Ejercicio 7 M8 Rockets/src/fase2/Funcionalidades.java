package fase2;

import java.util.ArrayList;

public class Funcionalidades {
	private ArrayList <Rocket> repositoryRockets = new ArrayList <Rocket>();
	
	//A function that creates rockets and stores them in a repository
	public void createRocket(String id, double[] boostersMaximumPower) {
		Boolean repeatedId = false;
		for (Rocket rocket : repositoryRockets) {
			if (rocket.getId().equals(id)) repeatedId =true;
		}
		Rocket newRocket;
		if (repeatedId) {//If we already used this id, we will give a random one
			//We pass the a wrong id, so the constructor gives it a new id
			newRocket = new Rocket("hdh", boostersMaximumPower);
			this.createRocket(newRocket.getId(), boostersMaximumPower);//We call again this function
		}else {
			//If the name is correct and wasn't used before, we create a rocket and store it in our repository
			newRocket = new Rocket (id, boostersMaximumPower);
			repositoryRockets.add(newRocket);
		}

	}
	
	public void printRepository() {//This function prints the rockets in the repository with its characteristics
		for (Rocket rocket : this.repositoryRockets) {
			System.out.println(rocket.printAll());
		}
	}

}
