package PreguntasDeExamen2;

public class Pregunta22 {
  //¿Cuál es la salida del siguiente código?
/*
 * 
 * salidas
 * javZ2sAa
 * jZvZ2sAa
 * jZv
 * jZvZ2s
 * java2s
 */
			  public static void main(String args[]) {
				   String s = "java2s"; 
			        s.replace('a', 'Z').trim().concat("Aa"); 
			        s.substring(0, 2); 
			        System.out.println(s);// la salida de este codigo es java2s
			  }
			}
	
/*
 * Nota
Los objetos de cuerda son inmutables.

 */

