package PreguntasDeExamen2;

public class Pregunta11 {
	//¿Qué se emitirá por el siguiente código?
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i; 
        int j; 
        for (i=1; i < 4; i++) { 
           for (j=2; j < 4; j++) { 
              if (j == 3) { 
                 continue; 
              } 
              System.out.println("i: " + i + " j: " + j); 
           } 
        } 
       /*
        * Nota
			La instrucción continue salta los valores 3 para j. 
        */
          
	}

}
