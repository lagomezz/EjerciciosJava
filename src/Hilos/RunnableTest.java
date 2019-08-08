package Hilos;

public class RunnableTest {

	public static void main(String[] args) {
	 /// isntacion de un objeto
		SinThread  obj= new SinThread();
		Thread hilo = new Thread();
		
		try {
			hilo.wait();
		} catch (InterruptedException e) {
	
			e.printStackTrace();
		}

	}

}
