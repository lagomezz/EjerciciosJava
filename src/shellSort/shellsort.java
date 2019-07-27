package shellSort;

public class shellsort {

	
	
	public  static int[] Ordenshellsort(int[] arrgle) {
		int longitud = arrgle.length;
		
		for (int brecha = longitud/2; brecha > 0; brecha/=2) {// mitad de la mitad 
			
			for (int visitador = brecha; visitador < longitud; visitador++) {
				int elemento = arrgle[visitador];
				int auxiliar = visitador;
				while ((auxiliar >= brecha) && (arrgle[auxiliar-brecha]>elemento)) {//arrgle[auxiliar-brecha]>elemento comparacion de brecha  contrs visitador 
					 arrgle[auxiliar] = arrgle[auxiliar-brecha];
					 auxiliar-=brecha;
					
				}
				arrgle[auxiliar]= elemento;
			}
		}
		
		
		return arrgle;
	} 
	
	
	public static void main(String[] args) {
		int[] arreglo = {3,2,4,1};
		System.out.println("este es el arreglo sin ordenar");
		for(int i : arreglo) {
			System.out.print(i+" ");
		}
		System.out.println("\neste es el arreglo sin ordenar");
		Ordenshellsort(arreglo);
		for(int i : arreglo) {
			System.out.print(i+" ");
		}
	}

}
