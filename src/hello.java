import java.util.ArrayList;
import java.util.ListIterator;

public class hello {

	public static void main(String[] args) {
		//se crea objeto array list de tipo string para agregar datos 
		 ArrayList<String> nombres = new ArrayList<String>();
		// ListIterator<String> Lister = new ListIterator<String>();
		 // con la pirpiedad size() el cual retorna el tamaño de mi arreglo
	        System.out.println("Elementos al inicio: " + nombres.size());
	        nombres.add("Ana");
	        nombres.add("Bea");
	        nombres.add("Dalia");
	        nombres.add("Pedro");
	        nombres.add("Bea");  //comprobar que admite duplicados
	        
	        while (nombres.listIterator().hasPrevious()) {
				System.out.print(nombres.listIterator().previous()+ " ");
				System.out.print("hola mundo");
			}
	        nombres.listIterator().hasPrevious();
	        System.out.println("Contenido: " + nombres);
	        System.out.println("Elementos: " + nombres.size());
	       System.out.println(nombres.contains("Ana"));
	 
	        nombres.remove("Ana"); //eliminamos un elemento
	 
	        System.out.println("Contenido: " + nombres);
	        System.out.println("Elementos: " + nombres.size());
	        System.out.println(nombres.contains("Ana"));
	 
	        nombres.add(3, "Ana"); //Añadir en posicion x
	        System.out.println("Contenido: " + nombres);
	 
	        System.out.println("SubLista(1,4):" + nombres.subList(1,4));
		
	}

}
