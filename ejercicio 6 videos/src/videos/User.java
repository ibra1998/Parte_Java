package videos;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

import errores.EmptyFieldException;

public class User {
	private String name;
	private String surname;
	private String password;
	private ArrayList<Video> videosList = new ArrayList<Video>();
	private Date recordDate;

	//We need a constructor that doesn't require a date, as it uses the current date
	User(String name, String surname, String password) throws EmptyFieldException{
		if (name.equals("")) {
			throw new EmptyFieldException("El campo nombre no puede estar vacio");
		}
		if (surname.equals("")) {
			throw new EmptyFieldException("El campo apellidos no puede estar vacio");
		}
		if (password.equals("")) {
			throw new EmptyFieldException("El campo contraseña no puede estar vacio");
		}
		this.name = name;
		this.surname = surname;
		this.password = password;
		this.recordDate = new Date();
	 }
	//We need getters for every attribute
	String getName() {
		return this.name;
	}
	String getSurname() {
		return this.surname;
	}
	/*
	 * The password must not be accesible from outside
	String getPassword() {
		return this.password;
	}
	*/
	Date getDate() {
		return this.recordDate;
	}
	
	//Setters
	void setName(String name) {
		this.name = name;
	}
	void setSurname(String surname) {
		this.surname = surname;
	}
	/*
	 * The password must not be accesible from outside
	void setPassword(String password) {
		this.password = password;
	}*/
	void setDate(int Day, int Year, int Month) {
		GregorianCalendar newDate = new GregorianCalendar(Year, Month, Day);
		this.recordDate = newDate.getTime();
		
	}

	//The user must be able to create new videos
	void addVideos(String url, String title, ArrayList<String> tags) {
		try {
			this.videosList.add(new Video(url, title, tags));
		}catch(EmptyFieldException e) {
			System.out.println("error al crear video");
		}
		
	}
	//We need a method that checks if the password is correct
	Boolean checkPassword(String password) {
		return (this.password.equals(password));
	}
	
	//The user must be able to see the videos he has
	void showVideos() {
		for (Video video: videosList) {
			System.out.println(video.getTitle() + " " + " url: " + video.getUrl() + " tags ");
			for (String tag: video.getTags()) {
				System.out.print("#" + tag);
			}
		}
	}
	//We need a method that modifies a user
	void manipulateUser(Scanner reader) throws Exception {
		int choice;
		do {
			System.out.println("Qué desea hacer con este usuario: \n 1: Cambiar nombre\n 2: Cambiar apellidos\n "
					+ "3: Cambiar contraseña \n 4: Administrar video \n 5: Subir videos \n 6: Salir");
			choice = reader.nextInt();//We ask him in which way he wants to manipulate
			reader.nextLine();
			switch(choice) {
			case 1://In case we want to modify the name
				System.out.println("Introduzca el nuevo nombre");
				String name  = reader.nextLine();
				this.name = name;
				break;
			case 2://In case we want to modify surname
				System.out.println("Introduzca los apellidos nuevos");
				String surname  = reader.nextLine();//We collect the new surname and replace it in the stored attribute
				this.surname = surname;
				break;
			case 3://In case we want to change the password we ask the actual password once and the new twice
				System.out.println("Introduzca la antigua contraseña");
				String password = reader.nextLine();
				System.out.println("Introduzca la nueva contraseña");
				String newPassword = reader.nextLine();
				System.out.println("Introduzca la nueva contraseña otra vez");
				String verifiedPassword = reader.nextLine();
				if (password.equals(this.password)) {//First, we need to verify we are dealing with the correct user, by verifying the password
					if (newPassword.equals(verifiedPassword)) {//the password must be introduced twice, to be sure it was correctly written
						this.password = newPassword;//If everything is OK, we change the password
					}else {
						System.out.println("La nueva contraseña no coincide con la confirmada");//This message shows in case password wasn't correctly verfied
					}
				}else {
					System.out.println("La contraseña introducida no es correcta");
				}
				break;
			case 4://In case we want to manipulate video
				if (videosList.isEmpty()) {//We must check if there is any video
					System.out.println("No hay vídeos en la lista");
				}else {//If there is any video, we show which are available
					System.out.println("Qué vídeo desea manipular (Introduzca el indice correspondiente)");
					for (Video video : videosList) {
						System.out.println(videosList.indexOf(video) + " Titulo: " + video.getTitle() + ", url: " + video.getUrl() + " tags: " + video.tagsToString());
					}
					String chosenVideoString = reader.nextLine();//We store the chosen video
					int chosenVideo = Integer.parseInt(chosenVideoString);
					if ( 0<chosenVideo && chosenVideo > videosList.size()) {
						throw new IllegalArgumentException("Se debe introducir un numero entre 0 y " 
					+ videosList.size());//error if the input introduced is not correct
					}
					try {
						videosList.get(chosenVideo).manipulateVideo(reader);//as manipulate video could throw an Exception
					}catch(EmptyFieldException e) {
						System.out.println("Error al manipular el video");
					}
				}
				break;
			case 5:
				System.out.println("Introduzca el título del video");
				String title = reader.nextLine();
				System.out.println("Introduzca el url del video");
				String url = reader.nextLine();
				System.out.println("Introduzca el numero de tags que quieras");
				int numberTags = reader.nextInt();//We need to know the number of tags the user wants
				reader.nextLine();
				ArrayList<String> tags = new ArrayList<String>();
				for (int i = 0; i<numberTags; i++) {
					tags.add(reader.nextLine());
				}
				this.addVideos(url, title, tags);//We create the video
				break;
			}

		}while (choice != 6);
		System.out.println("Usted ha salido de la sesión");//We show this message to know we log out
	}
}
