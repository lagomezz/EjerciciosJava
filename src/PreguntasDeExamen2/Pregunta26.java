package PreguntasDeExamen2;

public class Pregunta26 {
//Dado el siguiente código, seleccione las declaraciones correctas:
	class Shape {
		  public void fragrance() {
		    System.out.println("Shape");
		  }
		}

		class Rectangle {
		  public void fragrance() {
		    System.out.println("Rectangle");
		  }
		}

		class Square {
		  public void fragrance() {
		    System.out.println("Square");
		  }
		}

		public class Main {
		  public void arrangeShapes() {
		    //Shape f1 = new Rectangle();
		    //Shape f2 = new Square();
		    //f1.fragrance();
		  }
		}
		/*
		 * Nota
				Ninguna de las clases Rectángulo o Cuadrado extiende la clase Forma.
				Por lo tanto, una variable de tipo Shape no se puede usar para almacenar objetos de las clases Rectangle o Square.
				Las siguientes líneas de código no se compilarán:
				Forma f1 = nuevo Rectángulo ();
				Forma f2 = nuevo cuadrado (); 

		 */
}
