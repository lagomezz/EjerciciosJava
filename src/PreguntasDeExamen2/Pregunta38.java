package PreguntasDeExamen2;
//�Cu�l es la salida del siguiente c�digo?
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
 * sb1 permanece 123456 despu�s de la ejecuci�n de la siguiente l�nea de c�digo:

 sb1.subSequence (2, 4); 

Dado que subSequence devuelve la secuencia secundaria y mantiene el sb1 sin cambios.

El m�todo deleteCharAt elimina un valor char en la posici�n 3.

Como las posiciones est�n basadas en cero, el d�gito 4 se elimina del valor 123456, lo que da como resultado 12356.

El m�todo inverso modifica el valor de un StringBuilder asign�ndole la representaci�n inversa de su valor.

El reverso de 12356 es 65321.

 clase p�blica principal {
   public static void main (String args []) {
     StringBuilder sb1 = new StringBuilder ( "123456" );
     sb1.subSequence (2, 4);
     sb1.deleteCharAt (3);
     sb1.reverse ();
     System.out.println (sb1);
   }
 }

El c�digo anterior genera el siguiente resultado.

 */
