package ClasesString;

public class StringStringBuilder {

	public static void main(String[] args) {
		StringBuilder demo2 = new StringBuilder ("Hola");
		// El objeto anterior tambi�n se almacena en el heap y su valor puede ser modificado
		demo2 = new StringBuilder ("Adi�s");
		// La declaraci�n anterior es correcta, ya que modifica el valor que se encuentra en el 
		// StringBuilder
		
		/**
		 * nota importante
		 * StringBuilder es igual que StringBuffer, se almacena el objeto en el Heap y tambi�n se 
		 * puede modificar. La principal diferencia entre el StringBuffer y el StringBuilder es que 
		 * StringBuilder no es seguro al utilizarse en hilos.
		 * StringBuilder es r�pido ya que no es seguro al utilizarse en los hilos, no es thread safe.
		 */
	}

}
