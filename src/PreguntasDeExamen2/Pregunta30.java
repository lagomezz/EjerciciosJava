package PreguntasDeExamen2;

public class Pregunta30 {
 /*
  * class Shape {
  void print() {
    System.out.println("Shape");
  }
}

class Rectangle extends Shape {
  void print(int a) {
    System.out.println("Rectangle");
  }
}

class Square extends Shape {
  void print() {
    System.out.println("Square");
  }
}

public class Main {
  public static void main(String args[]) {
    Shape shape = new Rectangle();
    Square rabbit = new Square();
    shape.print();
    rabbit.print();
  }
}

    a  Shape 
       Square 

    b  Rectangle 
       Square 

    c  Shape 
       Shape 

    d  None of the above 
  */
}
/*
 * Nota
La clase Rectangle no anula el m�todo print () definido en la clase Shape.

La clase Rectangle define un par�metro de m�todo con el m�todo print, lo que lo convierte en un m�todo sobrecargado, no en un m�todo anulado.

Debido a que la clase Rectangle extiende la clase Shape, tiene acceso a los siguientes dos m�todos de impresi�n sobrecargados:

void print () {System.out.println ( "Shape" ); }
void print (int a) {System.out.println ( "Rectangle" ); } 
La siguiente l�nea de c�digo crea un objeto de clase Rectangle y lo asigna a una variable de tipo Shape:

Forma forma = nuevo rect�ngulo (); 
Cuando llama al m�todo print en el objeto anterior, ejecuta el m�todo print, que no acepta ning�n par�metro del m�todo, imprimiendo el siguiente valor:

Shape
El siguiente c�digo tambi�n imprimir� Forma y no Rect�ngulo:

Forma de rect�ngulo = nuevo Rect�ngulo ();
shape.print (); 
Clase Forma { / / f r o m w w w . j a v a 2 s . c o m void print () {             
  
    System.out.println ( "Shape" );
  }
}

clase Rect�ngulo extiende Forma {
   void print ( int a) {
    System.out.println ( "Rectangle" );
  }
}

clase Cuadrado extiende Forma {
   void print () {
    System.out.println ( "Square" );
  }
}

 Clase p�blica Main {
   public  static  void main (String args []) {
    Forma forma = nuevo rect�ngulo ();
    Conejo cuadrado = cuadrado nuevo ();
    shape.print ();
    rabbit.print ();
  }
 */
