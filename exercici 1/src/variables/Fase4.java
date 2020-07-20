package variables;

public class Fase4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nom = "Brahim";
		String cognom1 = "El";
		String cognom2 = "Habzi";
		int dia = 8;
		int mes = 4;
		int myYear = 1998;
		boolean bool = (myYear %400 ==0) || (myYear %4 == 0 && myYear%100 != 0);
		String textBisiesto;
		// Dependiendo de si myYear es o no bisiesto, imprimimos la cadena correspondiente
		if (bool) {
			textBisiesto = "El meu any de naixement és de traspàs";
		}else {
			textBisiesto = "El meu any de naixement no és de traspàs";
		}
		String nomComplet =  nom +  " " + cognom1 + " " + cognom2;
		String dataCompleta = dia + "/" + mes + "/" + myYear;
		System.out.println("El meu nom és "+ nomComplet);
		System.out.println("Vaig néixer el dia " + dataCompleta);
		System.out.println(textBisiesto);
		

	}
}
