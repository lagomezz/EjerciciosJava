package QuickSort;

import java.util.Random;

public class echopormi {
//documentacion https://www.geeksforgeeks.org/quick-sort/
	//Metodo de ordenamineto Quick Sort
	 public static void quickSort(int[] vector, int izquierda, int derecha) {
		 //1. Elegir el pivote
		    int pivote = vector[izquierda];
		    //2. Los elementos > al pivote van a su derecha, los < a su izquierda
		    //esta parte de la implementaci�n es el coraz�n del ordenamiento
		    //se utilizan variables auxiliares:
		    //- i para controlar los elementos a la izquierda del pivote
		    //- j para controlar los elementos a la derecha del pivote
		    int i = izquierda;
		    int j = derecha;
		    //esta variable deber�a tener un alcance menor pero se respeta la implementaci�n
		    int auxIntercambio;
		    //mientras que deban evaluarse los elementos en el arreglo
		    //para ubicar al nuevo pivote
		    while (i < j) {
		    	
		    	
		        //mientras que el elemento vector[i] sea menor o igual al pivote
		        //se aumenta el valor de i
		        //cuando este loop se detenga, el elemento en vector[i]
		        //es mayor a pivote y deber� ir a su derecha
		        while (vector[i] <= pivote && i < j) {
		            i++;
		        } 
		        //mientras que el elemento vector[j] sea mayor al pivote
		        //se desminuye el valor de j
		        //cuando este loop se detenga, el elemento en vector[j]
		        //es menor o igual a pivote y deber� ir a su izquierda
		        while (vector[j] > pivote) {
		            j--;
		        }
		        //siempre y cuando i sea menor a j, se hace un cambio de los elementos
		        //puesto que el elemento en vector[i] debe ir a la derecha
		        //y vector[j] a la izquierda
		        if (i < j) {
		            //nota: auxIntercambio podr�a estar declarada aqu� ya que NO tiene otro alcance
		            auxIntercambio = vector[i];
		            vector[i] = vector[j];
		            vector[j] = auxIntercambio;
		        }
		    }
		    //Por los ciclos anteriores, j lleg� a una posici�n donde su elemento (i.e. vector[j]) 
		    //es menor o igual al pivote, actualizamos entonces la posici�n del pivote, mandando vector[j] 
		    //a la ubicaci�n del pivote y viceversa (el pivote a la posicion vector[j])
		    vector[izquierda] = vector[j];
		    vector[j] = pivote;
		    //3. Para A1 y A2, aplicar el mismo proceso.
		    if (izquierda < j - 1) {
		        //quicksort aplicado a A1
		        quickSort(vector, izquierda, j - 1);
		    }
		    if (j + 1 < derecha) {
		        //quicksort aplicado a A2
		        quickSort(vector, j + 1, derecha);
		    }
	    }

	    public static void main(String[] args) {
	        int[] numeros = new int[40];
	        Random rnd = new Random();
	        System.out.println("Vector desordenado");
	        for (int i = 0; i < numeros.length; i++) {
	            numeros[i] = rnd.nextInt(50);
	            System.out.print(numeros[i] + " ");
	        }   
	        // cuenta el vector menos -1 debido a que estaria contando dede la pocision 0 
	        echopormi.quickSort(numeros, 0, numeros.length - 1);
	        System.out.println("\nVector Ordenado");
	        for (int n : numeros) {
	            System.out.print(n + " ");
	        }

	    }
}



