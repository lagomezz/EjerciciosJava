package synchronizedEjemplo;

public class Fichero {
	public static void main(String[] args) {
		int[] array = {2,3,4,5,6,5,3,2};
		synchronized ( array) {
			for (int i = 0; i < array.length; i++) {
				System.out.println("arreglos: "+i);
			}
		}
	}
}
