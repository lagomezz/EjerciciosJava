package PreguntasDeExamen2;

import java.util.ArrayList;

public class Pregunta7 {

	
	/*
	 * ¿Cuál de las siguientes afirmaciones se puede usar para determinar si se puede encontrar un gato en la lista?
	 * ArrayList <String> list = new ArrayList <> ();
         list.add ( "perro" );
         list.add ( "cat" );
         list.add ( "rana" ); 
	 */
	public static void main(String[] args) {
		ArrayList <String> list = new ArrayList <> ();
        list.add ( "perro" );
        list.add ( "cat" );
        list.add ( "rana" ); 
        
        System.out.println( list.contains ("cat"));// es correcta debido a que el metodo contains debuelve un verdadero y falso
       // list.hasObject ("cat"); // esta marca error 
        System.out.println( list.indexOf ("cat"));// esta es la opcion correcta 
        System.out.println(list.indexOf (1));
	}
	/*
	 * Nota
			El contiene () devuelve verdadero si se encuentra el objeto e indexOf toma una referencia de objeto y 
			    devuelve el índice del objeto si se encuentra, de lo contrario, devuelve un -1.
			El método indexOf no toma un argumento entero.	
			El método hasObject no existe en la clase ArrayList.
	 */
}
