package Hilos;

// hay un pequeño inconveniente con la sentecia Thread es que no se puede heredar de otras clases
//// se tiene que crear un objeto de tipo Thread para que se crea un hilo a traves del un contructor
//  es esta liga contiene informacion sobre la ejecucion de thread de Runnables y los normales 
// con el uso de los cuales estan extendidos como thread 
//https://ricardogeek.com/como-definir-y-ejecutar-threads-en-java/
public class EjemploHilo extends Thread {
	 public void run()
	    {
	        // Código del hilo   
		 System.out.println("Objeto del hilo se esta ejecuntanco en letodo Run");
	    }  
}
