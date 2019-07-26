package PreguntasDeExamen2;
//¿Cuál es la salida del siguiente código?
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
La siguiente línea de código no tiene errores de compilación:

 para (; i <2; i = i + 5) { 
El uso del bloque de inicialización es opcional en un bucle for.

En este caso, el uso de un punto y coma (;) lo termina.

Para la primera iteración, la variable i tiene un valor de 0.

Debido a que este valor es menor que 2, la siguiente construcción if se evalúa como verdadera y se ejecuta la instrucción continue:

si (i <5) continúa ; 
La instrucción continue ignora todas las declaraciones restantes en una iteración de bucle for, el control no imprime el valor de la variable i, lo que lleva al control a pasar a la siguiente iteración.

En la siguiente iteración, el valor de la variable i es 5. La condición del bucle for se evalúa como falsa y el control sale del bucle for.

 clase pública principal {
   pública  estática  vacía vacía (cadena args []) {
     int i = 0; / * f r o m w w w . j a v a 2 s . c o m * / para (; i <2; i = i + 5) {
       if (i <5)
         continuar ;                   
    
      System.out.println (i);
    }
    System.out.println (i);
  }
}
El código anterior genera el siguiente resultado.



 */
