package PreguntasDeExamen2;

public class Pregunta1 {
	private int i = 1;
	//�Qu� pasar� cuando compiles y ejecutes el siguiente c�digo?
//  1 se imprimir�
//	2 ser�n impresos
//	Se generar� un error de compilaci�n. // se genra un erro de codigo dibido a aque someMethod es statico y la variable no 
//	Se lanzar� una excepci�n.
	
	/*
	 * Nota
       No puede acceder a una variable de instancia desde un m�todo est�tico.
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
