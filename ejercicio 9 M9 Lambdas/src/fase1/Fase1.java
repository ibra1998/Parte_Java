package fase1;

import java.util.ArrayList;

public class Fase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//I create a list of names to play with
		ArrayList<String> nomsPropis = new ArrayList<String>();
		nomsPropis.add("Miguel");
		nomsPropis.add("Maria");
		nomsPropis.add("Jose");
		nomsPropis.add("Alba");
		nomsPropis.add("Bruno");
		nomsPropis.add("Ana");
		nomsPropis.add("Ada");
		nomsPropis.add("Jose");
		nomsPropis.add("Fatima");
		nomsPropis.add("Johnathan");
		nomsPropis.add("Fredy");
		
		//I return a list with names starting with A and that are 3 chars length
		nomsPropis.stream()
			.map (String::toUpperCase)//to be able to compare, I should uppercase all names
			.filter(s -> s.startsWith("A"))//I choose only the ones starting with A
			.filter (s -> s.length() ==3)//I choose only the ones that are 3 characters length
			.forEach(System.out::println);//I print the list
		
		//We create a list of numbers
		ArrayList<Integer> randomNumbers = new ArrayList<Integer>();
		randomNumbers.add(1);
		randomNumbers.add(12);
		randomNumbers.add(43);
		randomNumbers.add(54);
		randomNumbers.add(65);
		randomNumbers.add(6543);
		randomNumbers.add(7654);
		
		//I transform my list of numbers adding e or o depending if it's even or odd
		randomNumbers.stream()
			.map(num -> (num % 2 ==0 ? "e": "o") + ""+num)//We put e or o concatenated with the number
			.forEach(System.out::println);//We print
		
		//This  part prints a list of names that contains "o"
		nomsPropis.stream()
			.filter(s -> s.contains("o"))//I choose the names containing o
			.forEach(System.out::println);//I print my list
		
		//This prints a list of names that contains o or have 5 characters
		nomsPropis.stream()
		.filter(s -> s.contains("o") || s.length()==5)
		.forEach(System.out::println);
		
		//We create a list of months of the YEAr
		ArrayList<String> months = new ArrayList<String>();
		months.add("Enero");
		months.add("Febrero");
		months.add("Marzo");
		months.add("Abril");
		months.add("Mayo");
		months.add("Junio");
		months.add("Julio");
		months.add("Agosto");
		months.add("Septiembre");
		months.add("Octubre");
		months.add("Noviembre");
		months.add("Diciembre");
		
		//I print all elements of my List using lambda
		months.forEach(month -> System.out.println(month));
		//I print all elements using method references
		months.forEach(System.out::println);
		

	}

}
