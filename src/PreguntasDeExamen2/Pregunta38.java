package PreguntasDeExamen2;
//¿Cuál es la salida del siguiente código?
/*
 * Respuestas
    521
    Runtime exception
    65321
    65431

 */
public class Pregunta38 {
	public static void main(String[] args) {
		 StringBuilder sb1 = new StringBuilder("123456");
		 System.out.println(sb1.subSequence(2, 4));
		    System.out.println( sb1.deleteCharAt(3));
		    System.out.println( sb1.reverse());
		    System.out.println(sb1);
	} 
}
/*
 * sb1 permanece 123456 después de la ejecución de la siguiente línea de código:

 sb1.subSequence (2, 4); 

Dado que subSequence devuelve la secuencia secundaria y mantiene el sb1 sin cambios.

El método deleteCharAt elimina un valor char en la posición 3.

Como las posiciones están basadas en cero, el dígito 4 se elimina del valor 123456, lo que da como resultado 12356.

El método inverso modifica el valor de un StringBuilder asignándole la representación inversa de su valor.

El reverso de 12356 es 65321.

 clase pública principal {
   public static void main (String args []) {
     StringBuilder sb1 = new StringBuilder ( "123456" );
     sb1.subSequence (2, 4);
     sb1.deleteCharAt (3);
     sb1.reverse ();
     System.out.println (sb1);
   }
 }

El código anterior genera el siguiente resultado.

 */
