package ejercicio3NombresCiudades;

public class Fase3 {
	static void ejecutar(String[] arrayCiudades) {
		//Hacemos un array para cuando queramos ejecutar esta parte del codigo sin ponerlo manualmente
		//String[] arrayCiudades = {"Barcelona", "Madrid", "Valencia", "Malaga", "Santander", "Cadis"};
		String ciudadModificada;//Una variable para ir guardando cada elemento cambiado
		//Creo un array vacío con el mismo numero de elementos que ciudades para el array modificado
		int numeroElementos = arrayCiudades.length;
		String[] arrayCiudadesModificadas = new String[numeroElementos];
		for (int i = 0; i<arrayCiudades.length; i++) {//Para cada ciudad haremos este proceso
			ciudadModificada = arrayCiudades[i].replace("a", "4"); //Cambio la a por un 4
			arrayCiudadesModificadas[i] = ciudadModificada;//Agrego la ciudad modificada al array	
		}
		//Reciclamos el mismo codigo anterior para ordenar
		Fase2.ejecutar(arrayCiudadesModificadas);

	}

}
