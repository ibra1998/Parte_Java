package fase2;

public class ImplementedClass{
	
	public static void printPiValue() {
		//I create an implementation for my functional interface 
		InterfaceGetPiValue myImplementation = () ->3.1415;
		System.out.println(myImplementation.getPiValue());//I execute getPiValue and print it
	}

}
