package PreguntasDeExamen2;

public class Pregunta16 {
//�Cu�l de las siguientes afirmaciones se compilar� sin errores?
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 3; 
	     int j = 3; 
	     int k = 3; 
	     System.out.println(i >= j);
	     if(i > j) {
	    	 System.out.println("Mensaje");
	     }
	     //if(i > j > k) {} // marca error 
	     if(i > j && i > k) {
	    	 System.out.println("Mensaje");
	     }
	    // if(i > j && > k) {} //marca error 

	     
	     /*
	      * Nota
				B da como resultado una comparaci�n entre i y j que devuelve un valor booleano.
				Este valor no puede compararse con el entero k.
				D requiere un operando antes de la expresi�n> k.
	      */
	}

}
