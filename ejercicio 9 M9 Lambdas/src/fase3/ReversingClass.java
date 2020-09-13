package fase3;

public class ReversingClass {
	public static void printReversedString() {
		//I create my string
		String myWord = "Las expresiones lambda molan";
		//I create an instance of the reversingInterface, with a lambda expression
		ReversingInterface a = palabra ->{ //The lambda accepts a string a returns it reversed
			String reversedWord = "";//This is going to be my reversed string
			for (int i = palabra.length()-1; i>=0; i--) {//I loop over my string, from end to the start
				reversedWord += String.valueOf(palabra.charAt(i));//I add the character one by one
				}
			return reversedWord;//I return the value
			};
		System.out.println(a.reverse(myWord));//I apply the interface and print the result

		}
		

}
