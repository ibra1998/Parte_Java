package prueba2;

class fase1 {

	public fase1() {
		//Creamos la lista char
		letrasNombre = new char [6];
		letrasNombre[0] = 'B';
		letrasNombre[1] = 'R';
		letrasNombre[2] = 'A';
		letrasNombre[3] = 'H';
		letrasNombre[4] = 'I';
		letrasNombre[5] = 'M';
	}
	private char [] letrasNombre; //Inicializamos la variable letrasNombre de la clase Fase1
	
	//por si lo vamos a necesitar la variable letrasNombre, hacemos un getter
	char[] getletrasNombre() {
		return letrasNombre;
	}
	
	
	//Aqui la funcion que va a imprimir desde el main
	void ejecutar() {
		String letrasAcumuladas="";
		for (char letra: letrasNombre) { //Recorremos el Array
			letrasAcumuladas +=String.valueOf(letra); //guardamos en un unico String los chars del nombre para imprimirlo por pantalla
		}
		System.out.print(letrasAcumuladas);
	}
		



}
