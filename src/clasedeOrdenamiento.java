
public class clasedeOrdenamiento {
	
	public static  int[] ordenar(int[] array) {
		int temp;
	    int arregloTamano = array.length;
	    for (int i = 1; i < arregloTamano; i++) //revisa que si hay enlementos en un arreglo
	    {
	         for (int k = arregloTamano- 1; k >= i; k--) 
	         {
	                if(array[k] < array[k-1])
	                {
	                    temp = array[k];// inicia con la pocision 0
	                    array[k] = array[k-1];// array 
	                    array[k-1]=  temp;
	                }
	         }
	    }
	    return array;
	}
	
	public static void main(String[] args) {
		int[] arreglo = {1233,2,3,4,5,2,1,2,2,3,1,1,33,4,5,56,6,7,7,8,8,4545,7};
		for (int i = 0; i < arreglo.length; i++) {
			int j = arreglo[i];
			System.out.print(j+" ");
		}
		ordenar(arreglo);
		System.out.println(" ");
		for (int pivote : arreglo) {
			System.out.print(pivote+" ");
		}
	}
	
}
