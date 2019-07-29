package Hilos;

// hay un pequeño inconveniente con la sentecia Thread es que no se puede heredar de otras clases
public class EjemploHilo extends Thread {
	 public void run()
	    {
	        // Código del hilo   
		 System.out.println("Objeto del hilo se esta ejecuntanco en letodo Run");
	    }  
}
