package PreguntasDeExamen2;
//Dado el siguiente código, ¿cuál de las opciones es verdadera?
/*
	+El método de impresión definido en las clases Forma, Rectángulo y Cuadrado es polimórfico.
	+Solo el método print definido en las clases Shape y Square es polimórfico.
	+Solo el método print definido en la clase Square es polimórfico.
	+Ninguna de las anteriores. 
 */
public class Pregunta33 {

}
//la respuesta correcta es 
//+El método de impresión definido en las clases Forma, Rectángulo y Cuadrado es polimórfico.
class Shape { 
    void print() {} 
} 
class Rectangle extends Shape { 
    void print() {} 
} 
class Square extends Shape { 
    void print() {} 
} 
/*
 Nota
	Cuando los métodos con la misma firma de método se definen en clases que comparten una relación de 
	herencia, los métodos se consideran polimórficos. 
 */