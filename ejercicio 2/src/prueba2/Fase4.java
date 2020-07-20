package prueba2;

import java.util.ArrayList;

import java.util.List;

class Fase4 {
	List <String> letrasNombreCompleto = new ArrayList<> ();

		// TODO Auto-generated method stub
		//Creamos la variable letrasApellidos donde guardamos en forma de lista las letras del apellido
	public Fase4() {
		ArrayList <String> letrasApellidos = new ArrayList <String>();
		letrasApellidos.add("E");
		letrasApellidos.add("L");
		letrasApellidos.add(" ");
		letrasApellidos.add("H");
		letrasApellidos.add("A");
		letrasApellidos.add("B");
		letrasApellidos.add("Z");
		letrasApellidos.add("I");
		
		//Primero introducimos también la variable-lista letrasNombre
		ArrayList <String> letrasNombre = new ArrayList <String>();
		letrasNombre.add("B");
		letrasNombre.add("R");
		letrasNombre.add("A");
		letrasNombre.add("H");
		letrasNombre.add("I");
		letrasNombre.add("M");
		
		// Creamos una nueva variable lista para guardar nombre y apellidos juntos
		letrasNombreCompleto.addAll(letrasNombre);
		letrasNombreCompleto.add(" ");
		letrasNombreCompleto.addAll(letrasApellidos);
	}
	void ejecutar () {
		System.out.print(letrasNombreCompleto);
	}

	

}
