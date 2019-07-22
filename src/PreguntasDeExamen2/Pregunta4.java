package PreguntasDeExamen2;

public class Pregunta4 {
	//Dado el siguiente código, ¿qué expresión muestra la palabra "Igual"?
	/*
	    s1==s2 // sale Not equal
	    s1.matchCase(s2) // error
	    s1.equalsIgnoreCase(s2)// Equal correcto 
	    s1.equals(s2) // Not equal
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s1="Java"; 
         String s2="java"; 
         if(s1.equalsIgnoreCase(s2)) { 
            System.out.println("Equal"); 
         } else { 
            System.out.println("Not equal"); 
         } 
	}
	/*
	 Nota
		A compara la igualdad de referencia de objeto.
		B es incorrecto porque no hay método como matchCase.
		D usa el método de iguales con el caso que es diferente en las dos cadenas.
	 */

}
