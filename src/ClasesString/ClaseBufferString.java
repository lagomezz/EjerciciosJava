package ClasesString;

public class ClaseBufferString {
	public static void main(String[] args) {
		StringBuffer demo1 = new StringBuffer ("Hola");
		// El objeto anterior se almacena en el Heap y su valor se puede modificar.
		demo1 = new StringBuffer ("Adiós");
		// La declaración anterior es correcta, ya que modifica el valor que se encuentra en el
		// StringBuffer
		System.out.println(demo1);
	}
}
