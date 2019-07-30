package Staticos;

public class ClaseTest1 {
	/*
	 * Conclusiones
			La directiva static permite el acceso a métodos y variables de clase sin la necesidad de instanciar un objeto de dicha 
			clase, permitiendo la inicialización de forma cómoda y durante la carga de clase. Además, los import estáticos mejoran 
			la legibilidad de nuestro código, así como las clases estáticas internas la cohesión.
	 */
	public static void main(String[] args) {
		double pi = Math.PI;
		//la clase match es una clase estatica debido a que no requiere una isntacia de la clase para poder obtner la clases o 
		System.out.println("Ejemplo de Static "+pi);
	}
}
