package PreguntasDeExamen2;

public class Pregunta8 {
// ¿Cuál de las siguientes afirmaciones compilará?
	/*
	 * 	mientras (i <j) {}
		mientras yo) {}
		while (i = 5) {}
		while ((i = 12)! = 5) {}
	 */
	public static void main(String[] args) {
		int i = 5;
		int j = 10;

	    while(i < j) {
	    	System.out.println("Mensaje2");
	    }
	  //  while(i) {} // Marca error debido a que solicita un booleano 
	   // while(i = 5) {} // while requiere un boolenano para su funcionamiento 
	    while((i = 12)!=5) {
	    	System.out.println("Mensaje");
	    }


	    /*
	     * Nota
			while () en Java solo acepta expresiones evaluadas a un valor booleano.
	     */
	}

}
