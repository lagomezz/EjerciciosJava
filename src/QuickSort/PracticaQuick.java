package QuickSort;

public class PracticaQuick {
	 public static void quickSort(int[] arreglo, int izquierda, int derecha) {
		    int pivote = arreglo[izquierda]; // se encuantra en pivote // al iual lo estamos usuado como especio en memoria 
		    int i = izquierda; // pocicion ala izquierda 
		    int j = derecha; // pocicion final del arreglo
		
		    int auxIntercambio;
		    
		    while (i < j) {// visitador con el de inicio
		        while (arreglo[i] <= pivote && i < j) {
		            i++;
		        } 
		        while (arreglo[j] > pivote) {
		            j--;
		        }
		        if (i < j) {       
		        	//cambio de pocision dentro del arreglo
		            auxIntercambio = arreglo[i];
		            arreglo[i] = arreglo[j];
		            arreglo[j] = auxIntercambio;
		        }
		    }	
		    arreglo[izquierda] = arreglo[j];// mover mi posicionamiento
		    arreglo[j] = pivote;
		// metodos recursovos 
		    if (izquierda < j - 1) {
		        
		        quickSort(arreglo, izquierda, j - 1);
		    }
		    if (j + 1 < derecha) {
		     
		        quickSort(arreglo, j + 1, derecha);
		    }
		    }
	
	public static void main(String[] args) {
		int[] arreglo = {3,2,4,1,5};
		System.out.println("este es el arreglo sin ordenar");
		for(int i : arreglo) {
			System.out.print(i+" ");
		}
		quickSort(arreglo, 0, arreglo.length-1);
		System.out.println("\neste es el arreglo ordenado");
		for(int i : arreglo) {
			System.out.print(i+" ");
		}
	}

}
