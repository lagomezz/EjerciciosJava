package PreguntasDeExamen2;

public class Pregunta21 {
//https://www.arquitecturajava.com/comparando-java-vs-equals/
	//�Cu�l es la salida del siguiente c�digo?
	
	/*
	 * verdadero impreso una vez
		falso impreso una vez
		verdadero impreso en un bucle infinito
		Falso impreso en un bucle infinito.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	String s1 = new String("Java");
		    String s2 = new String("Java");
		    String s3 = "Java";
		    String s4 = "Java";
		    do
		      System.out.println(s1.equals(s2));
		    while (s3 == s4);
		    
	}
	/*
	 * Nota
		Los objetos de cadena que se crean sin usar el nuevo operador se colocan en un conjunto de cadenas.
		s3 y s4 est�n en un conjunto de cadenas y est�n apuntando al mismo objeto de cadena.
		Las variables s3 y s4 se refieren a los mismos objetos de cadena.
		Por lo tanto, ambas de las siguientes comparaciones devolver�n verdadero:
		s3 == s4 (compara las referencias de objetos) 
		s3.equals (s4) (compare los valores del objeto) 
		Las variables s1 y s2 se refieren a diferentes objetos de cadena, tienen los mismos valores. As� que s1.equals (s2) tambi�n devuelve true.
		Debido a que la condici�n de bucle (s3 == s4) siempre devuelve verdadero, el c�digo se imprime verdadero en un bucle infinito.
	 */

}
