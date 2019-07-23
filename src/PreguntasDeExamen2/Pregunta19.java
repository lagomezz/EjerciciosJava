package PreguntasDeExamen2;

public class Pregunta19 {
	//¿Cuál de las siguientes declaraciones se compilará sin la sintaxis o los errores de tiempo
	//de ejecución si reemplazan la línea de comentarios?
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
		La opción c es incorrecta porque no puede asignar un valor doble a una variable entera.
 */
	}

}
