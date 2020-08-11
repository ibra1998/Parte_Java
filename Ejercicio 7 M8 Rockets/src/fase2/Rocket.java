package fase2;

import java.util.ArrayList;

public class Rocket {
	private String id;//The id identifies the rocket, it must be unique for each rocket
	private ArrayList<Booster> boosters;
	
	//Constructor if we already made the Arraylist of boosters and we pass it as parameter
	public Rocket(String id, ArrayList<Booster> boosters) {
		if (id.length() !=8) {//The id must be 8 characters lenght, if not
			//We warn the user
			System.out.println("Se ha asignado un nuevo id al cohete ya que "
					+ "el utilizado no cumple con los requisitos");
			//And we call giveRandomId that gives a random id to this rocket
			this.giveRandomId();
			System.out.println("El codigo asignado es el " + this.id);//We tell which id was assigned
		}else {
			this.id = id;//If the id length is correct, we save it
		}
		this.boosters = boosters;//And we collect the booster objects arrayList parameter
	}
	
	//This constructor uses the id assigned and creates an Array double and make from it the arraylist of booster
	public Rocket(String id,double[] boosters) {//This part behaves as before
		if (id.length() !=8) {
			System.out.println("Se ha asignado un nuevo id al cohete ya que "
					+ "el utilizado no cumple con los requisitos");
			this.giveRandomId();
			System.out.println("El codigo asignado es el " + this.id);
		}else {
			this.id = id;
		}
		//until here, everything is like the first constructor
		this.boosters = new ArrayList<Booster>();//We create an empty arraylist
		for (int i = 0; i< boosters.length; i++) {
			//the arrayList is going to be as long as the double array parameter
			//We create a booster with each value and add it to the list of boosters
			this.boosters.add(new Booster(boosters[i]));
		}
	}
	
	
	//Getters
	public String getId() {
		return this.id;
	}
	public ArrayList<Booster> getBoosters() {
		return this.boosters;
	}
	
	//We need a method that returns as String the boosters maximum power
	public String getMaximumPowerBooster() {
		String maximumPowerBooster = "";
		for (Booster booster: this.boosters) {
			maximumPowerBooster += booster.getmaximumPower() + ", ";
		}
		return maximumPowerBooster;
	}
	
	public String printAll() {
		String discription = "id: " + this.id + " propulsores: " + this.getMaximumPowerBooster();
		return discription;
	}
	//A method that creates a random id to the rocket
	public void giveRandomId() {
		int i =0;
		String caracteresPosibles= "abcdefghijklmnopqrstuvwxyz123456789";//Possible values than fit in the id
		String newId = "";//The id is a String
		int randomPosition;//We will add in every step one letter to the id
		for (i=0; i<8; i++) {//We will loop 8 times because the id has 8 characters
			randomPosition = ((int) (Math.random()*caracteresPosibles.length()));//We chose a random position
			//We add the letter that occupies this position to the id
			newId += caracteresPosibles.substring(randomPosition, randomPosition+1);
		}
		this.id = newId;//Now that we have made the new id, we raplace the attribute
	}

}
