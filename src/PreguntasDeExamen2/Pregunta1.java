package PreguntasDeExamen2;

public class Pregunta1 {
	private int i = 1;
	//¿Qué pasará cuando compiles y ejecutes el siguiente código?
//  1 se imprimirá
//	2 serán impresos
//	Se generará un error de compilación. // se genra un erro de codigo dibido a aque someMethod es statico y la variable no 
//	Se lanzará una excepción.
	
	/*
	 * Nota
       No puede acceder a una variable de instancia desde un método estático.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 2;
		Pregunta1 s = new Pregunta1();

		s.someMethod();
	}
	public static void someMethod() {
		//System.out.println(i); // marca error 
	}

}
