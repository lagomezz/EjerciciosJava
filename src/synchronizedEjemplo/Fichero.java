package synchronizedEjemplo;

public class Fichero {
	public static void main(String[] args) {
		// se crean la instasia del metodo 
		Hilosvarios obj = new Hilosvarios();
		Hilosvarios obj2 = new Hilosvarios();
		// se ejeuta el hilo con el metodo star 
		obj.start();
		try {
			// el metodo join obloga al hilo a terminar su secuencias 
			obj.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	
		obj2.start();
		try {
			obj2.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("Sincornizacion terminsda");
	}
	
}
// se crea una clase la cual extiende de la clase Thread 
class Hilosvarios extends Thread {
	// se rescribe la clase run para ejecutar el metodo estar al invocarl la clase 
	public void run() {
		// se corre un arreglo para que este traiga un arreglos con varios parametros
		 try {
			 for (int i = 0; i < 15; i++) {
				 System.out.println("Esto es un hilo"+ getName());
				 // se crea este metodo para que en cada siclo espere 500 milisegundos con el metodo sleep
				 Hilosvarios.sleep(500);
			 }
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		
	}
}
