package ejercicio3NombresCiudades;
public class Fase2 {
	static void ejecutar(String[] arrayCiudades) {//Recibo ciudades
		String variableComodin = "";//Necesitaré una variable intermedia para ir intercambiando posiciones
		for (int i = 0; i<arrayCiudades.length; i++) {//Quiero ir desde la primera hasta la última palabra 
			for (int j = 0; j < arrayCiudades.length; j++) {//Quiero comparar con todas las palabras que están en otras posiciones
				if (arrayCiudades[j].compareTo(arrayCiudades[i])>0){//si la palabra de la derecha es mayor lexicográficamente, intercambiamos
					variableComodin = arrayCiudades[i];
					arrayCiudades[i] = arrayCiudades[j];
					arrayCiudades[j] = variableComodin;
				}
			}
			/*Si estuvieran en la misma posicion, habría dado 0, en caso de que dé menos de 0, eso es que ya está en su posición correcta
			 * Vamos intercambiando y comparando de dos en dos posiciones
			 */
		}
		//Imprimimos todo el array que tenemos, ya que ahora tenemos la lista ordenada
		for (String ciudad : arrayCiudades) {
			System.out.println(ciudad);
			
		}

	
		
		
	}

}
