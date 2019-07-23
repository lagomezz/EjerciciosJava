package PreguntasDeExamen2;

public class Pregunta17 {
//�Qu� se imprimir� cuando se ejecute el siguiente c�digo?
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
			S�lo el primer caso tiene la declaraci�n de ruptura.
			Est� bien usar constantes para las instrucciones de cambio.
			
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
