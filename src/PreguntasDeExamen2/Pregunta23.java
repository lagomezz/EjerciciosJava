package PreguntasDeExamen2;

public class Pregunta23 {
//�Cu�l de las siguientes l�neas de c�digo puede reemplazar individualmente la l�nea 
	// INSERTAR C�DIGO AQU� para que el c�digo se compile correctamente?
	/*
	 * case 10*3: System.out.println(2);
		case num: System.out.println(3);// esta no por que el valor de num es el variable que esta siendo utilizada en el case
		case 10/3: System.out.println(4);
		case num2: System.out.println(5);

	 */
	public static int getVal() { 
        return 100; 
    } 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num = 10; 
	        final int num2 = 20; 
	        switch (num) { 
	            // INSERT CODE HERE 
	           case num2:
	        	   System.out.println(2);
	            break; 
	            default: System.out.println("default"); 
	        } 
	    /*
	     * Nota
				A= es correcto. Las constantes de tiempo de compilaci�n, incluidas las expresiones, est�n permitidas en las etiquetas de casos.	
				B= es incorrecto Las etiquetas de casos deben ser constantes en tiempo de compilaci�n. 
					Una variable no final no es una constante de tiempo de compilaci�n porque puede ser reasignada un valor durante el curso de la ejecuci�n de una clase.
				C= es correcta. El valor especificado en las etiquetas de casos debe ser asignable a la variable utilizada en la 
					construcci�n del interruptor.
				10/3 descarta la parte decimal y compara 3 con la variable num.
				D= es correcta. La variable num2 se define como una variable final y se le asigna un valor en la misma l�nea de c�digo,
				 con su declaraci�n. Se considera que es una constante de compilaci�n
					     */
	}

}
