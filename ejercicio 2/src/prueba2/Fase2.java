package prueba2;
import java.util.ArrayList;

public class Fase2 {
	private ArrayList <String> letras =  new ArrayList <String>();
	public Fase2(){
		// TODO Auto-generated method stub
		//Ponemos todas las letras de mi nombre al ArrayList letras;
		letras.add("B");
		letras.add("R");
		letras.add("A");
		letras.add("H");
		letras.add("I");
		letras.add("M");
	}
	
	//Getter de las letras del nombre
	public ArrayList <String> getLetrasNombre(){
		return letras;
	}
	
	public void ejecutar(){
		int i = 0;
		boolean foundNumber = false;
		while( i <letras.size() ) { //Hacemos un bucle para detectar si hay numeros, y mirar vocales y consonantes
			System.out.print(letras.get(i));//Imprimimos la letra que toque
			if (letras.get(i) == "A" || letras.get(i) == "E" ||
				letras.get(i) == "I" || letras.get(i) == "O" || 
				letras.get(i) == "U") {
				System.out.println(": VOCAL"); //Si es vocal, imprime vocal a continuacion
			}else if (letras.get(i) == "1" || letras.get(i) == "2" ||letras.get(i) == "3" ||
			letras.get(i) == "4" ||letras.get(i) == "5" ||letras.get(i) == "6" ||
			letras.get(i) == "7" ||letras.get(i) == "8" ||letras.get(i) == "9" ||
			letras.get(i) == "0"){
				foundNumber = true;//Si es un número, queremos guardar true en la variable foundNumber
				System.out.println(": numero");
				
			}else {
				System.out.println(": CONSONANT"); //Si no es ni vocal ni numero, esque es consonante (Aunque sea un poco falso)
			}
			i++; //Para que el bucle avance
		}
		if (foundNumber) {
			System.out.println("\n Los nombres no deberían contener números");
			//Queremos imprimir este texto para que advierta de que se ha introducido un numero
		}
		

	}

}
