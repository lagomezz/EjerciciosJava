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
					El m�todo java.lang.Thread.sleep (long millis, int nanos) hace que el hilo que se est� 
					ejecutando actualmente se suspenda durante el n�mero especificado de milisegundos m�s el
					 n�mero especificado de nanosegundos, sujeto a la precisi�n y exactitud de los 
					 temporizadores y programadores del sistema.
				 */
				
				/*
				 * M�todos de uso com�n:
						void start(): usado para iniciar el cuerpo de la thread definido por el m�todo run().
						void sleep(): pone a dormir una thread por un  tiempo m�nimo especificado.
						void join(): usado para esperar por el t�rmino de la thread sobre la cual el m�todo es invoacado, 
						por ejemplo por t�rmino de m�todo run().
						void yield(): Mueve a la thread desde el estado de corriendo al final de la cola de procesos en espera 
						por la CPU.
						
						MethodTest.java
						Java 2 dej� obsoleto (deprecated) varios de estos m�todos definidos en versiones previas (Java 1.0 y Java 1.1.) para prevenir inconsistencia de datos y deadlock.  Se recomienda evitar el uso de estos m�todos. Ellos son: 
						void stop() el cual detiene la ejecuci�n de la thread no importando consideraci�n alguna.
						void  suspend() el cual para detener temporalmente la ejecuci�n de una thread.
						void resume() reactiva una thread suspendida.
				 */
				
				}
			} catch (InterruptedException e) {
			
			}
		}
		
	}
	

