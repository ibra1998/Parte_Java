package videos;

import java.util.*;

import errores.EmptyFieldException;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);//We create reader to introduce data from the console
		ArrayList<User> listUsers = new ArrayList<User>();//We need this list to save all our users
		int choice,//Here we are going to save the number that corresponds to the choice the customer makes
			numberTags;
		String name, surname, password, title, url;
		
		do {//We want to loop at least once and as many times as the user wants
			System.out.println("Qué desea hacer ahora: \n1 crear nuevo usuario \n2 Añadir videos"
					+ "\n3 Administrar usuario \n4 salir");
			choice = reader.nextInt();
			reader.nextLine();
			switch(choice) {
			case 1:
				//In case we want to create a new user, we ask for the details and introduce them in its variables
				System.out.println("Introduzca el nombre por favor");
				name = reader.nextLine();
				System.out.println("Introduzca el apellido o apellidos, por favor");
				surname = reader.nextLine();
				System.out.println("Introduzca la contraseña por favor");
				password = reader.nextLine();
				//We try to create the new user with the introduced data, and add it to listUsers
				try {
					listUsers.add(new User(name,surname,password));
					System.out.println("Usuario creado");
				}catch(EmptyFieldException e) {
					System.out.println("No ha podido ser introducido porque algún campo está vacío");
				}
				break;
			
			case 2:
				//In case we want to add a video to a user, we show names and surnames of the users registered
				for (User user: listUsers) {
					System.out.println("Nombre: " + user.getName() + ", apellidos: " + user.getSurname());
				}
				System.out.println("Introduzca el nombre del usuario al que quiere añadir el video");
				boolean foundUser = false;
				name = reader.nextLine();//We store the name introduced in the console
				for (User user: listUsers) {
					if (user.getName().equals(name)) {
						//If we find the user with the its name we would like to verify the user
						System.out.println("Introduzca la contraseña por favor");
						password = reader.nextLine();
						if (user.checkPassword(password)) {//This method checks if a password is correct
							foundUser = true;
							System.out.println("Introduzca el título del video");
							title = reader.nextLine();
							System.out.println("Introduzca el url del video");
							url = reader.nextLine();
							System.out.println("Introduzca el numero de tags que quieras");
							numberTags = reader.nextInt();//We need to know the number of tags the user wants
							reader.nextLine();
							ArrayList<String> tags = new ArrayList<String>();
							for (int i = 0; i<numberTags; i++) {
								tags.add(reader.nextLine());
							}
							user.addVideos(url, title, tags);//We create the video
							System.out.println("Video añadido");
						}else {
							System.out.println("la contraseña no es correcta");
						}
					}
				}
				if (!foundUser) {
					System.out.println("El nombre del usuario introducido no es correcto");
				}
				break;
			case 3:
				//if we chose to manipulate the user, we need first of all to verify which user wants to do so
				if (listUsers.isEmpty()) {
					System.out.println("No hay registro de usuarios, crea un usuario para poder hacer cosas con él");
					name = "";
					surname = "";
					password = "";
				}else {

					System.out.println("Introduzca los datos del usuario que quiere manipular");
					System.out.println("Nombre");
					name = reader.nextLine();//ask for name
					System.out.println("Apellidos");
					surname = reader.nextLine();//We ask for surname
					System.out.println("Contraseña");
					password = reader.nextLine();//We ask the password

				}
				for (User user: listUsers) {//We loop over our list of users
					if (user.getName().equals(name) && user.getSurname().equals(surname)) { //we verify name and surname to know if we find him
						if (user.checkPassword(password)) {//We verify he knows the password
							try {
								user.manipulateUser(reader);//We use this function to modify a users attributes
							}catch(Exception e) {
								System.out.println("Error al manipular el video");
							}
						}else {
							System.out.println("La contraseña introducida no es correcta");//In case he doesn't know the password
						}
					}
				}
				break;
			}
			if (choice>5 && choice <1) {
				System.out.println("El numero introducido no es correcto");//only values 1,2 3 and 4 are possible
			}
		}while(choice != 4);
		System.out.println("Ha salido usted del programa");//When we finish, we tell
		reader.close();//We close the scanner
	}


}
