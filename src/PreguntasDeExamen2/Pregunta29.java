package PreguntasDeExamen2;
//�Cu�l es la salida del siguiente c�digo?

public class Pregunta29 {
	public static void main(String[] args) {
	    int i = 10;
	    do
	      while (i < 15)
	        i = i + 20;
	    while (i < 2);
	    System.out.println(i);
	  
	}
	/*
	 * La condici�n especificada en el bucle do-while se eval�a como falso porque 10 <2 se eval�a como falso.

			Pero el control ingresa al bucle do-while porque el bucle do-while se ejecuta al menos una vez.
			
			El while se eval�a como verdadero para la primera iteraci�n y agrega 20 a i, por lo que es 30.
			
			 clase p�blica Main {
			   public  static  void main (String [] args) {
			     int i = 10; / / w w w . j a v a 2 s . c o m do while (i <15)          
			    
			      
			        i = i + 20;
			    mientras que (i <2);
			    System.out.println (i);
			  }
			}
	 */
}
