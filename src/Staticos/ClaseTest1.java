package Staticos;

public class ClaseTest1 {
	/*
	 * Conclusiones
			La directiva static permite el acceso a m�todos y variables de clase sin la necesidad de instanciar un objeto de dicha 
			clase, permitiendo la inicializaci�n de forma c�moda y durante la carga de clase. Adem�s, los import est�ticos mejoran 
			la legibilidad de nuestro c�digo, as� como las clases est�ticas internas la cohesi�n.
	 */
	public static void main(String[] args) {
		double pi = Math.PI;
		//la clase match es una clase estatica debido a que no requiere una isntacia de la clase para poder obtner la clases o 
		System.out.println("Ejemplo de Static "+pi);
	}
}
