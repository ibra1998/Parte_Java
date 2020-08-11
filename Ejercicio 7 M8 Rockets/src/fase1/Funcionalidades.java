package fase1;

import java.util.ArrayList;

public class Funcionalidades {
	private ArrayList <Rocket> repositoryRockets = new ArrayList <Rocket>();
	
	//A function that creates rockets and stores them in a repository
	public void createRocket(String id, int numberBooster) {
		Boolean repeatedId = false;
		for (Rocket rocket : repositoryRockets) {
			if (rocket.getId().equals(id)) repeatedId =true;
		}
		Rocket newRocket;
		if (repeatedId) {
			newRocket = new Rocket("hdh", numberBooster);
			this.createRocket(newRocket.getId(), numberBooster);
		}else {
			newRocket = new Rocket (id, numberBooster);
			repositoryRockets.add(newRocket);
		}

	}
	public void printRepository() {//This function prints the rockets in the repository with its characteristics
		for (Rocket rocket : this.repositoryRockets) {
			System.out.println("id del cohete " + rocket.getId() + ", número de propulsores: "
					+ rocket.getCountBooster());
		}
	}

}
