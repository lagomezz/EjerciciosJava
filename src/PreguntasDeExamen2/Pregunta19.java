package PreguntasDeExamen2;

public class Pregunta19 {
	//�Cu�l de las siguientes declaraciones se compilar� sin la sintaxis o los errores de tiempo
	//de ejecuci�n si reemplazan la l�nea de comentarios?
	  public int i; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pregunta19 obj = new Pregunta19();

	    obj.i = 5;
	    int j = obj.i;
	    System.out.println(j);
	    //  obj.i = 5.0;// es un valor entero y no double 
	    System.out.println(obj.i);
/*
		 * Nota
		La opci�n c es incorrecta porque no puede asignar un valor doble a una variable entera.
 */
	}

}
