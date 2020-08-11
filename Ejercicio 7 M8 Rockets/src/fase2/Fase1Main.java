package fase2;

public class Fase1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//We need an object to operate with
		Funcionalidades ejecutarFunciones = new Funcionalidades();
		//We call a method that creates rockets from an id and a double array twice
		ejecutarFunciones.createRocket("32WESSDS", new double[] {10, 30, 80});
		ejecutarFunciones.createRocket("        ", new double[] {30, 40, 50, 50, 30, 10});
		ejecutarFunciones.printRepository();//We print everything we have in the console

	}
	

}
