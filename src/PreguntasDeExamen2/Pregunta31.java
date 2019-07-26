package PreguntasDeExamen2;
//�Cu�l es la salida del siguiente c�digo?
public class Pregunta31 {
 public static void main(String[] args) {
	 int i = 0;
	    for (; i < 2; i = i + 5) {
	      if (i < 5)
	        continue;
	      System.out.println(i);
	    }
	    System.out.println(i);
 }
}
// la salida es 5 
/*
 * Nota
La siguiente l�nea de c�digo no tiene errores de compilaci�n:

 para (; i <2; i = i + 5) { 
El uso del bloque de inicializaci�n es opcional en un bucle for.

En este caso, el uso de un punto y coma (;) lo termina.

Para la primera iteraci�n, la variable i tiene un valor de 0.

Debido a que este valor es menor que 2, la siguiente construcci�n if se eval�a como verdadera y se ejecuta la instrucci�n continue:

si (i <5) contin�a ; 
La instrucci�n continue ignora todas las declaraciones restantes en una iteraci�n de bucle for, el control no imprime el valor de la variable i, lo que lleva al control a pasar a la siguiente iteraci�n.

En la siguiente iteraci�n, el valor de la variable i es 5. La condici�n del bucle for se eval�a como falsa y el control sale del bucle for.

 clase p�blica principal {
   p�blica  est�tica  vac�a vac�a (cadena args []) {
     int i = 0; / * f r o m w w w . j a v a 2 s . c o m * / para (; i <2; i = i + 5) {
       if (i <5)
         continuar ;                   
    
      System.out.println (i);
    }
    System.out.println (i);
  }
}
El c�digo anterior genera el siguiente resultado.



 */
