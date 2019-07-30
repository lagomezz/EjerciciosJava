package PreguntasDeExamen2;
//�Cu�l es el resultado del siguiente c�digo?
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

El c�digo no se compilar�.

Las etiquetas de caso requieren valores constantes en tiempo de compilaci�n, y la variable num2 no califica como tal.

La variable num2 se define como una variable final, no se le asigna un valor con su declaraci�n.

El c�digo asigna un valor literal 20 despu�s de su declaraci�n, pero el compilador de Java no lo considera una constante de tiempo de compilaci�n. 
 */
 

