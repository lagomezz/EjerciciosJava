package PreguntasDeExamen2;

public class Pregunta9 {
	//¿Cuál de los siguientes bucles do / while se compilarán sin errores?
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
				C necesita paréntesis alrededor de la expresión, i <50.
				D requiere una instrucción de bloque si se usa más de una instrucción entre las palabras clave do y while.
          */



	}

}
