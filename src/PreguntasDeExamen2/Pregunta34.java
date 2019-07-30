package PreguntasDeExamen2;

/*
 * 
 * �Cu�l de las siguientes l�neas de c�digo se puede insertar individualmente en //INSERT CODE HERE  para que la salida del 
 * c�digo sea la siguiente:
   
    Shape b = new Shape();
    Shape b = new Rectangle();
    Rectangle b = new Rectangle();
    Rectangle b = new Shape();
    Shape b = ((Rectangle)new Shape());
    Rectangle b = ((Rectangle)new Shape());

 */
public class Pregunta34 {

}
class Shapee { 
    void print() { 
        System.out.println("Shape - A"); 
    } 
} 
class Rectanglee extends Shapee { 
    void print() { 
        System.out.println("Rectangle - B"); 
    } 
} 
class Main { 
    Shapee a = new Shapee(); 
    //INSERT CODE HERE 
   
   // Rectangle b = new Rectangle();
    //a.print();
    //b.print(); 
} 
/*
 * Nota

+A es incorrecto. Este c�digo se compilar�, pero porque tanto la variable de referencia como el objeto son de tipo Shape.
+D es incorrecto. Este c�digo no se compilar�. No puede asignar un objeto de una clase base a una variable de referencia de una clase derivada.
+E es incorrecto. Esta l�nea de c�digo se compilar� correctamente, pero fallar� en tiempo de ejecuci�n con una ClassCastException.
Un objeto de una clase base no se puede convertir a un objeto de su clase derivada.
+F es incorrecto. La expresi�n ((Rect�ngulo) nueva Forma ()) se eval�a antes de que pueda asignarse a una variable de referencia de tipo 
Rect�ngulo. 
 */
