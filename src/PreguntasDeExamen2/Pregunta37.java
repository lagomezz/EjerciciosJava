package PreguntasDeExamen2;
//¿Cuál es el resultado del siguiente código?
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

	El código no tiene errores de compilación.
	El siguiente fragmento de código no forma parte de la construcción if: 
	
	{ 
    System.out.println("false"); 
	}
	
	 Por lo tanto, el valor falso se imprimirá pase lo que pase.
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

El código anterior genera el siguiente resultado.
es false
 */
