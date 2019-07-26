package QuickSort;

public class lol {
	
	public static int[] Quick(int[] arreglo) {
		int tem;
		for (int i = 0; i < arreglo.length; i++) {
			for (int j = i; j > 0; j--) {
				if(arreglo[j] < arreglo[j-1]) {
					tem = arreglo[j];
					arreglo[j]= arreglo[j-1];
					arreglo[j-1]= tem;
				}
			}
		}
		
		return arreglo;
		
	}
	
	public static void main(String[] args) {
		int[] arreglo = {3,5,7,1,3,12,4,6,4,23,2,34,532,34};
          int[]nuevo=  Quick(arreglo);
          for(int i : nuevo) {
        	  System.out.print(i+" ");
          }
	}

}
