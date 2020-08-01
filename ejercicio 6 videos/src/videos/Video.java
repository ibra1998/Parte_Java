package videos;

import java.util.ArrayList;
import java.util.Scanner;

import errores.EmptyFieldException;

public class Video {
	//I create the attributes I need
	private String url;
	private String title;
	private ArrayList<String> tags = new ArrayList<String>();
	
	//I create a constructor
	public Video(String url, String title, ArrayList<String> tags) throws EmptyFieldException{
		
		//I check that no field is empty
		if (url.equals("")) {
			throw new EmptyFieldException("El campo url no puede estar vacio");
		}
		if (title.equals("")) {
			throw new EmptyFieldException("El campo titulo no puede estar vacio");
		}
		if (tags.isEmpty()) {
			throw new EmptyFieldException("Se debe introducir al menos un tag");
		}
		
		//If all fields are correct, it creates the video
		this.url = url;
		this.tags = tags;
		this.title = title;
	}
	
	//Maybe when we make the video, we don't want any tag, so we need another kind of constructor
	public Video(String url, String title) throws Exception{
		
		//We check that no field is empty
		if (url.equals("")) {
			throw new EmptyFieldException("El campo url no puede estar vacio");
		}
		if (title.equals("")) {
			throw new EmptyFieldException("El campo titulo no puede estar vacio");
		}
		//if everything is correct, it creates the video without tags
		this.url = url;
		this.title = title;
		this.tags = new ArrayList<String>();
	}
	
	//I create a getter for every attribute we have;
	public String getUrl() {
		return this.url;
	}
	public ArrayList<String> getTags() {
		return this.tags;
	}
	public String getTitle() {
		return this.title;
	}
	
	//I create setters for every attribute
	public void setUrl(String url) {
		this.url = url;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setTags(ArrayList<String> tags) {
		this.tags = tags;
	}
	
	//As tags is an ArrayList, we may want to add or eliminate a tag
	public void addTag(String tag) {
		this.tags.add(tag);
	}
	public void eliminateTag(String tag) {
		this.tags.remove(tag);
	}
	public String tagsToString() {
		String stringOfTags ="";
		for (String tag: tags) {
			stringOfTags += "# " + tag+ " ";
		}
		return stringOfTags;
	}
	//We want a method that manipulates our videos
	public void manipulateVideo(Scanner reader) throws EmptyFieldException {
		int choice;
		do {
			System.out.println("¿Qué vídeo desea hacer? \n 1: cambiar título, \n 2: cambiar url \n 3 añadir tags "
					+ "\n 4 Quitar tags \n 5 Eliminar toda la lista de tags \n 6: salir");
			choice = reader.nextInt();//We collect the choice
			reader.nextLine();
			switch(choice) {
			case 1:
				String nuevoTitulo = reader.nextLine();
				if (nuevoTitulo.isEmpty()) {
					throw new EmptyFieldException(" debe introducir un titulo no vacío");
				}
				this.title = nuevoTitulo;
				break;
			case 2:
				String newUrl = reader.nextLine();
				if (newUrl.isEmpty()) {
					throw new EmptyFieldException(" debe introducir un url no vacío");
				}
				this.url = newUrl;
				break;
			case 3://Añadir tags
				String newTag = reader.nextLine();
				if (newTag.isEmpty()) {
					throw new EmptyFieldException(" debe introducir un tag no vacío");
				}
				this.addTag(newTag);
				break;
			case 4://Eliminate tag
				System.out.println("Qué tag desea eliminar");
				String chosenTag = reader.nextLine();//We ask for which tag we want to eliminate
				if (chosenTag.isEmpty()) {//There must be a correct value in chosenTag
					throw new EmptyFieldException(" debe introducir un tag no vacío");
				}
				this.eliminateTag(chosenTag);//We eliminate the tag asked
				break;
			case 5:
				this.tags = new ArrayList<String>();//We create a new empty ArrayList and replace our list of tags 
				System.out.println(" Se ha eliminado toda la lista de tags");
				break;
			}
		}while(choice != 6);
		System.out.println("Usted ha salido del vídeo");
	}

}
