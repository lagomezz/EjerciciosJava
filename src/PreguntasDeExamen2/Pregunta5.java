package PreguntasDeExamen2;

public class Pregunta5 {
	//�Cu�l de las siguientes expresiones evaluar� a 7? esto quiere decir cual de las 
	//siguentes expreciones sale como resultado 7
	/*
	 	2 + 4 * 3- 7       |-->sale 7
		(2 + 4) * (3 - 7)  |-->sale -24
		2 + (4 * 3) - 7    |-->sale 7
		((2 + 4) * 3) - 7) |-->sale 11
	 */
	public static void main(String [] args) {
		System.out.println(2 + 4 * 3- 7);
		System.out.println((2 + 4) * (3 - 7));
		System.out.println(2 + (4 * 3) - 7);
		System.out.println(((2 + 4) * 3) - 7);
		
	}
	/*
	 Note
		La opci�n b eval�a a -24. La opci�n d se eval�a a 11.
	 */
	
}
