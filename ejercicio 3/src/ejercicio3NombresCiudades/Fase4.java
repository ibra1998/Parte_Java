package ejercicio3NombresCiudades;

public class Fase4 {
	static void ejecutar(String[] arrayCiudades) {
		//Hacemos un array para cuando queramos ejecutar esta parte del codigo sin ponerlo manualmente
		//String[] arrayCiudades = {"Barcelona", "Madrid", "Valencia", "Malaga", "Santander", "Cadis"};
	//Cada Array ciudad# tiene la longitud de la palabra que ocupa la posición	
		String[] ciudad1 = new String[arrayCiudades[0].length()];
		String[] ciudad2 = new String[arrayCiudades[1].length()];
		String[] ciudad3 = new String[arrayCiudades[2].length()];
		String[] ciudad4 = new String[arrayCiudades[3].length()];
		String[] ciudad5 = new String[arrayCiudades[4].length()];
		String[] ciudad6 = new String[arrayCiudades[5].length()];
		String[][] ciudadesNueva = {ciudad1, ciudad2, ciudad3, ciudad4, ciudad5, ciudad6};//Para no repetir codigo, guardamos en un array de dos dimensiones
		for (int i = 0; i<ciudadesNueva.length; i++) {//Recorremos todas las ciudades de nuestro array
			for (int j = 0; j < ciudadesNueva[i].length; j++) {//Vamos de letra en letra
				ciudadesNueva[i][j] = String.valueOf(arrayCiudades[i].charAt(j));//Conseguimos la letra de la ciudad y la ponemos en su array correspondiente
			}
		}
		System.out.println("Aqui imprimimos por pantalla los String al revés");
		for (int i = 0; i<ciudadesNueva.length; i++) {//Recorremos todas las ciudades que tenemos en el array, para no hacerlo de 1 a uno
			for (int j = ciudadesNueva[i].length-1; j>=0 ; j--) {//Vamos del final de la palabra hasta el principio
				System.out.print(ciudadesNueva[i][j]);//Imprimimos la letra correspondiente
			}
			System.out.println();//DEjamos espacio entre palabras
		}
	}

}
