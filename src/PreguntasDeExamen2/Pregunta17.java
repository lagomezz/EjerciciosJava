package PreguntasDeExamen2;

public class Pregunta17 {
//¿Qué se imprimirá cuando se ejecute el siguiente código?
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		switch (5) { 
	    case 0: 
	       System.out.println("zero"); 
	       break; 
	    case 1: 
	       System.out.println("one"); 
	    default: 
	       System.out.println("default"); 
	    case 2: 
	       System.out.println("two"); 
	} 
	}
	/*
	 * Nota
			El caso predeterminado se puede colocar en cualquier lugar dentro del interruptor.
			Sólo el primer caso tiene la declaración de ruptura.
			Está bien usar constantes para las instrucciones de cambio.
			
			public class Main {
				  public static void main(String[] args) {
				    switch (5) {// w  w w.  j  a  v  a 2  s .  c  o  m
				    case 0:
				      System.out.println("zero");
				      break;
				    case 1:
				      System.out.println("one");
				    default:
				      System.out.println("default");
				    case 2:
				      System.out.println("two");
				    }
				  }
			}
	 */

}
