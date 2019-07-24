package PreguntasDeExamen2;

public class Pregunta24 {
// los tipos de datos que devuelve requieren son byte, int, char, String
	//y no acepta un cast de un valor por la perdida de datos
	//¿Cuál es la salida del siguiente código?
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num = 0;

		    switch (num) {
		    default:
		      System.out.println("default");
		    case 0:
		      System.out.println("case1");
		      
		    case 10 * 2 - 21:
		      System.out.println("case2");
		      break;
		    }
	}
	/*
	 * Nota
		10 * 2-20 es 0, que se duplica con otro 0 en la declaración del caso.
	 */

}
