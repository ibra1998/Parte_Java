package prueba2;
import java.util.HashMap;
public class Fase3 {
	private HashMap<String, String> letrasRepetidas = new HashMap<String, String>();
	public Fase3 () {
		/*
		 * 
		 * De esta manera introducimos todos los valores manualmente, incluido el contador de letras
		letrasRepetidas.put("B", "1");
		letrasRepetidas.put("R", "1");
		letrasRepetidas.put("A", "1");
		letrasRepetidas.put("H", "1");
		letrasRepetidas.put("I", "1");
		letrasRepetidas.put("M", "1");
		*/
		//manera 2: Automática teniendo la lista
		
		//Hacemos la lista
		char [] letrasNombre; //Si partimos del Array que teníamos hecho
		letrasNombre = new char [6];
		letrasNombre[0] = 'B';
		letrasNombre[1] = 'R';
		letrasNombre[2] = 'A';
		letrasNombre[3] = 'H';
		letrasNombre[4] = 'I';
		letrasNombre[5] = 'M';
		int contarLetras;
		
		//Creamos el map segun la lista y el contador contarLetras
		for (char letra : letrasNombre) {
			contarLetras = 0; //Un primer bucle para que mire cada letra y calcule el numero de veces que aparece
			for (char otrasLetras: letrasNombre) {
				if (letra == otrasLetras) { //Por cada vez que coincidan, debe sumar 1
					contarLetras++;
				}
			}
			//Para guardar el índice y el contador en la variable Hashmap
			letrasRepetidas.put(String.valueOf(letra), String.valueOf(contarLetras));
		}
	}
	//Imprimimos cada valor al lado de su correspondiente contarLetras
	void ejecutar() {
		for (String i : letrasRepetidas.keySet()) {
			System.out.print(i + "  :  ");
			System.out.println(letrasRepetidas.get(i));  
			}
		
	}

}
