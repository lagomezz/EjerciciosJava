package PruebasJunit;

public class OperacionesMatematicas {
	
	public static int Suma(int num1, int num2) {
		int resultado = num1 + num2;
		return resultado;
	}
	
	public static int Resta(int num1, int num2) {
		int resultado = num1 - num2;
		return resultado;
	}
	
	public static int Multi(int num1, int num2) {
		int resultado = num1 * num2;
		return resultado;
	}
	

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 4;
	
		System.out.println(Resta(num1, num2));
		System.out.println(Suma(num1, num2));
		System.out.println(Multi(num1, num2));
		
		
		

	}

}
