package PreguntasDeExamen2;

public class Pregunta6 {
	
	/*
	 * �Cu�l de las siguientes afirmaciones compilar� sin error?
		
		int myArray [];
		int myArray [5];
		int myArray [5] = {1,2,3,4,5};
		int myArray [] = {1,2,3,4,5};
	 */
   public static void main(String[]  args) {
	    int myArray1 [];// correcta
		//int myArray2 [5];//marca error del declaracion
		//int myArray3 [5] = {1,2,3,4,5};// marca error no se pude colocar en tama�o del arreglo
		int myArray4 [] = {1,2,3,4,5};// correcta 
   }
   /*
    * Nota
			La declaraci�n correcta es la siguiente.
			
			int myArray [] = new int [5]; 
    */
}
