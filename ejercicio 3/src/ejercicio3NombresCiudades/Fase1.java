package ejercicio3NombresCiudades;

import java.util.Scanner;

public class Fase1 {
	static String[] ejecutar() {
		Scanner in = new Scanner(System.in);
		String ciudad1;
		String ciudad2;
		String ciudad3;
		String ciudad4;
		String ciudad5;
		String ciudad6;
		System.out.println("Introduzca el nombre de una ciudad");
		ciudad1 = in.nextLine();
		System.out.println("Introduzca el nombre de otra ciudad");
		ciudad2 = in.nextLine();
		System.out.println("Introduzca el nombre de otra ciudad");
		ciudad3 = in.nextLine();
		System.out.println("Introduzca el nombre de otra ciudad");
		ciudad4 = in.nextLine();
		System.out.println("Introduzca el nombre de otra ciudad");
		ciudad5 = in.nextLine();
		System.out.println("Introduzca el nombre de otra ciudad");
		ciudad6 = in.nextLine();
		/*
		System.out.println(ciudad1);
		System.out.println(ciudad2);
		System.out.println(ciudad3);
		System.out.println(ciudad4);
		System.out.println(ciudad5);
		System.out.println(ciudad6);
		*/
		in.close();
		String[] ciudades = {ciudad1, ciudad2, ciudad3, ciudad4, ciudad5, ciudad6};
		return ciudades;
	}
}
