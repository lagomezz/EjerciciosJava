
import java.util.Arrays;

public class iterar {

	public static void main(String[] args) {
		//declaramos e inicializamos el arreglo de numeros int.
		int [] arreglo = {5,7,8,3,12,45,95,2,56,789,123,456,789,14,1,3,45,84,984};

		//for normal indicamos una variable i la que almacenara el indice del arreglo el cual vamos a iterar y se incrementara en uno.
		for(int i=0;i<arreglo.length ; i++)
		{
		    System.out.println(arreglo[i]+" arreglo 1");
		}

		//utilizamos un for-each para escribir menos codigo, indicando el tipo de dato,una variable pivote luego dos puntos (:) y 
		//finalmente el arreglo que vamos a recorrer 
		for(int pivote : arreglo)
		{
		    System.out.println(pivote);
		}

		//utilizamos Java 8 con Lambdas , primero convertimos nuestro arreglo a una lista con el metodo Arrays.asList 
		//luego utilizamos el metodo foreach de las colecciones Java el cual nos pide un parametro Consumer.
		Arrays.asList(arreglo).forEach(System.out::println);
	}

}
