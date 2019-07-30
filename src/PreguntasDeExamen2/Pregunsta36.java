package PreguntasDeExamen2;
//¿Cuál es el resultado del siguiente código?
/*
 * Posibles respuestas
    a  default 

    b  default 
       4 

    c  4 

    d  Compilation error 
 */
public class Pregunsta36 {
	public static void main(String[] args) {
		 int num = 20;
		    final int num2;
		    num2 = 20;
		    
		    switch (num) {
		    default:
		      System.out.println("default");
		      //marca error debido a auqe num2 hace referencia a una cosntante la cual es inmutable  case num2
		      //la respuesta correcta es D 
		    case 20:
		      System.out.println(4);
		      break;
		    }
	}	  
	}
/*
 * Nota

El código no se compilará.

Las etiquetas de caso requieren valores constantes en tiempo de compilación, y la variable num2 no califica como tal.

La variable num2 se define como una variable final, no se le asigna un valor con su declaración.

El código asigna un valor literal 20 después de su declaración, pero el compilador de Java no lo considera una constante de tiempo de compilación. 
 */
 

