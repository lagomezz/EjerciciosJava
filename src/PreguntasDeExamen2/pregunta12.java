package PreguntasDeExamen2;

public class pregunta12 {
     //¿Qué enunciado mostrará cada elemento de la matriz?
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myArray[] = {1,2,3,4,5};
		//for(int n : myArray[]) { System.out.println(n); } 
		for(int n : myArray) { System.out.print(n); } 
		for(int n=1; n < 5; n++) { System.out.print(myArray[n]); } 
		for(int n=1; n <= 4; n++) { System.out.print(myArray[n]); } 
	}
/*
 * Nota
No puede utilizar [] en una instrucción for-each.
 */
}
