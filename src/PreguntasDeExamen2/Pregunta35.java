package PreguntasDeExamen2;
 /*
  * �Cu�l es el resultado del siguiente c�digo? 
  */
/* pocibles respuestas
 *   		  a	 120 
                 121 
                 127 

              b  120 

              c  default 
                 2 

              d 120 
                 121 
                 127 
                 ddefault 
 */
public class Pregunta35 {
	public static void main(String args[]) {
	    byte foo = 120;
	    switch (foo) {
	    default:
	      System.out.println("default");
	      break;
	    case 2:
	      System.out.println("2");
	      break;
	    case 120:
	      System.out.println("120");
	    case 121:
	      System.out.println("121");
	    case 127:
	      System.out.println("127");
	      break;
	    }
	  }
}
/*
 * Nota

Para una declaraci�n de cambio, el control ingresa las etiquetas de los casos cuando se encuentra un caso coincidente.
El control cae a trav�s de las etiquetas de casos restantes hasta que termina con una declaraci�n de interrupci�n.

public class Main {
  public static void main(String args[]) {
    byte foo = 120;
    switch (foo) {
    default:
      System.out.println("default");
      break;
    case 2:
      System.out.println("2");
      break;
    case 120:
      System.out.println("120");
    case 121:
      System.out.println("121");
    case 127:
      System.out.println("127");
      break;
    }
  }
}



 */
