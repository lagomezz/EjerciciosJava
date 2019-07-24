package PreguntasDeExamen2;
//¿Cuál es la salida del siguiente código?
public class Pregunta31 {
 public static void main(String[] args) {
	 int i = 0;
	    for (; i < 2; i = i + 5) {
	      if (i < 5)
	        continue;
	      System.out.println(i);
	    }
	    System.out.println(i);
 }
}
// la salida es 5 