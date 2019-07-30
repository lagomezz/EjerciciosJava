package PreguntasDeExamen2;
//Dado el siguiente c�digo, �cu�l de las opciones es verdadera?
/*
	+El m�todo de impresi�n definido en las clases Forma, Rect�ngulo y Cuadrado es polim�rfico.
	+Solo el m�todo print definido en las clases Shape y Square es polim�rfico.
	+Solo el m�todo print definido en la clase Square es polim�rfico.
	+Ninguna de las anteriores. 
 */
public class Pregunta33 {

}
//la respuesta correcta es 
//+El m�todo de impresi�n definido en las clases Forma, Rect�ngulo y Cuadrado es polim�rfico.
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
	Cuando los m�todos con la misma firma de m�todo se definen en clases que comparten una relaci�n de 
	herencia, los m�todos se consideran polim�rficos. 
 */