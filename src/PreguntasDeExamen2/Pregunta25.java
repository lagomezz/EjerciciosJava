package PreguntasDeExamen2;

public class Pregunta25 {
//�Cu�l es la salida del siguiente c�digo?
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  boolean myVal = false;// recuerda que el tipo de dato boolena es mutable 
		    if (myVal= true)// y se le esta haciendo una asignacion a que se true por lo que el if se ejecuanta siempre y cuando el valor sea verdadero
		      for (int i = 0; i < 2; i++)
		        System.out.println(i);
		    else
		      System.out.println("else");
		  /*
		   * Nota
					La expresi�n utilizada en la construcci�n if no compara el valor de la variable myVal con el valor literal verdadero.
					Se le est� asignando el valor literal verdadero. El operador de asignaci�n = asigna el valor literal.
					Debido a que el valor resultante es un valor booleano, el compilador no se queja de la asignaci�n en la construcci�n if.
					El bucle for es parte de la construcci�n if, que imprime 0 y 1.
					La parte else no se ejecuta porque la condici�n if se eval�a como verdadera.
					 clase p�blica principal {
					   p�blica  est�tica  vac�a vac�a (cadena args []) {
					     booleano myVal = falso;
					    if (myVal = true)
					       para ( int i = 0; i <2; i ++)
					        System.out.println (i); / * f r o m w w w . j a v a 2 s . c o m * / else 
					      System.out.println ( "else" );            
					    
					  }
					}
					El c�digo anterior genera el siguiente resultado.
		   */

	}

}
