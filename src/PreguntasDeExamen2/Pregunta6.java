package PreguntasDeExamen2;

public class Pregunta6 {
	
	/*
	 * ¿Cuál de las siguientes afirmaciones compilará sin error?
		
		int myArray [];
		int myArray [5];
		int myArray [5] = {1,2,3,4,5};
		int myArray [] = {1,2,3,4,5};
	 */
   public static void main(String[]  args) {
	    int myArray1 [];// correcta
		//int myArray2 [5];//marca error del declaracion
		//int myArray3 [5] = {1,2,3,4,5};// marca error no se pude colocar en tamaño del arreglo
		int myArray4 [] = {1,2,3,4,5};// correcta 
   }
   /*
    * Nota
			La declaración correcta es la siguiente.
			
			int myArray [] = new int [5]; 
    */
}
