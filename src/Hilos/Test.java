package Hilos;

public class Test {

	public static void main(String[] args) {
		// aqui se ejecuata en hilo 
		Thread objHilo = new EjemploHilo();
		// existen mas metodos para ejecutar un hilo 
		// en esta liga se muestran los metodos que envuelven al metodo Thread
		//https://www.callicoder.com/java-multithreading-thread-and-runnable-tutorial/
		objHilo.start();
	}

}
