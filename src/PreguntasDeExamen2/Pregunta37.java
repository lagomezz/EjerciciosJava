package PreguntasDeExamen2;
//�Cu�l es el resultado del siguiente c�digo?
/*Respuestas 
 *  a  true 
       false 
       ABC 

    b  false 
       ABC 

    c  true 
       ABC 

    d  Compilation error 
 */
public class Pregunta37 {
	public static void main(String[] args) {
		 int a = 10;
		 
		    if (
		    		a++ > 10) {
		      System.out.println("true");
		    }
		    {
		      System.out.println("false");
		    }
		    System.out.println("ABC"); 
		  
	}	
}

/*
 * Nota

	El c�digo no tiene errores de compilaci�n.
	El siguiente fragmento de c�digo no forma parte de la construcci�n if: 
	
	{ 
    System.out.println("false"); 
	}
	
	 Por lo tanto, el valor falso se imprimir� pase lo que pase.
	 public class Main {
  public static void main(String[] args) {
    int a = 10;//w w w .  ja v  a  2  s .  com
    if (a++ > 10) {
      System.out.println("true");
    }
    {
      System.out.println("false");
    }
  }
}

El c�digo anterior genera el siguiente resultado.
es false
 */
