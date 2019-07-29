package Hilos;



public class SinThread implements Runnable{
	// se tiene que crear un objeto de tipo Thread para que se crea un hilo a traves del un contructor
	//  es esta liga contiene informacion sobre la ejecucion de thread de Runnables y los normales 
	// con el uso de los cuales estan extendidos como thread 
	//https://ricardogeek.com/como-definir-y-ejecutar-threads-en-java/
    Thread t;
    int[] arreglo  = {2,4,3,2,4,5,3,2,4,5,3,2,3};

    // constructor 
    public SinThread() {
    	
    	t = new Thread(this, "primer hilo");
    	t.start();
    }


	public void run() {
			try {
				for(int i: arreglo) {
				System.out.println("Dato es "+i);
				Thread.sleep(500);
				/*
					El método java.lang.Thread.sleep (long millis, int nanos) hace que el hilo que se está 
					ejecutando actualmente se suspenda durante el número especificado de milisegundos más el
					 número especificado de nanosegundos, sujeto a la precisión y exactitud de los 
					 temporizadores y programadores del sistema.
				 */
				}
			} catch (InterruptedException e) {
			
			}
		}
		
	}
	

