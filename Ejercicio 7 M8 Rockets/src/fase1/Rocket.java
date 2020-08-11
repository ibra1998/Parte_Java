package fase1;

public class Rocket {
	private String id;//The id identifies the rocket, it must be unique for each rocket
	private int countBooster;//This indicates the number of boosters our rocket has
	
	//Constructor
	public Rocket(String id, int countBooster) {
		if (id.length() !=8) {
			System.out.println("Se ha asignado un nuevo id al cohete ya que "
					+ "el utilizado no cumple con los requisitos");
			this.giveRandomId();
			System.out.println("El codigo asignado es el " + this.id);
		}else {
			this.id = id;
		}
		this.countBooster = countBooster;
	}
	
	//Getters
	public String getId() {
		return this.id;
	}
	public int getCountBooster() {
		return this.countBooster;
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
