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
La clase Rectangle no anula el método print () definido en la clase Shape.

La clase Rectangle define un parámetro de método con el método print, lo que lo convierte en un método sobrecargado, no en un método anulado.

Debido a que la clase Rectangle extiende la clase Shape, tiene acceso a los siguientes dos métodos de impresión sobrecargados:

void print () {System.out.println ( "Shape" ); }
void print (int a) {System.out.println ( "Rectangle" ); } 
La siguiente línea de código crea un objeto de clase Rectangle y lo asigna a una variable de tipo Shape:

Forma forma = nuevo rectángulo (); 
Cuando llama al método print en el objeto anterior, ejecuta el método print, que no acepta ningún parámetro del método, imprimiendo el siguiente valor:

Shape
El siguiente código también imprimirá Forma y no Rectángulo:

Forma de rectángulo = nuevo Rectángulo ();
shape.print (); 
Clase Forma { / / f r o m w w w . j a v a 2 s . c o m void print () {             
  
    System.out.println ( "Shape" );
  }
}

clase Rectángulo extiende Forma {
   void print ( int a) {
    System.out.println ( "Rectangle" );
  }
}

clase Cuadrado extiende Forma {
   void print () {
    System.out.println ( "Square" );
  }
}

 Clase pública Main {
   public  static  void main (String args []) {
    Forma forma = nuevo rectángulo ();
    Conejo cuadrado = cuadrado nuevo ();
    shape.print ();
    rabbit.print ();
  }
 */
