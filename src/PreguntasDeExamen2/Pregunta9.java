package PreguntasDeExamen2;

public class Pregunta9 {
	//�Cu�l de los siguientes bucles do / while se compilar�n sin errores?
	/*
	 * 		a.  int i = 0;  
                do {  
                   System.out.println(i++);  
                } while (i < 50); 

            b.  int i = 0;  
                do  
                   System.out.println(i++);  
                while (i < 50); 
---------------------------------------------
            c.  int i = 0;  
                do   
                   System.out.println(i++);  
                while i < 50; 
                marca error
----------------------------------------
            d.  i = 0;  
                do  
                   System.out.println(i);  
                   i++;
                   i++;  
                   i++;  
                while (i < 50); 
                Marca error 
	 */
	public static void main(String[] args) {
		 int i = 0;  
         do  
            System.out.println(i++);  
         while (i < 50); 
         
         /*
          * Nota
				C necesita par�ntesis alrededor de la expresi�n, i <50.
				D requiere una instrucci�n de bloque si se usa m�s de una instrucci�n entre las palabras clave do y while.
          */



	}

}
