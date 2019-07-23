package PreguntasDeExamen2;

public class Pregunta18 {
//¿Cuáles de los siguientes son usos válidos de la variable sb?
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder(); 
	    System.out.println( sb.append(34.5));
	    //sb.deleteCharAt(34.5);// el alcace de la variable es demaciada 
	   // sb.toInteger(3); // el metodo si existe javascript 
	    System.out.println( sb.toString());

	}
 /*
	  * Nota
	No hay un método StringBuilder toInteger.
	deleteCharAt no acepta doble valor.
  */
}
