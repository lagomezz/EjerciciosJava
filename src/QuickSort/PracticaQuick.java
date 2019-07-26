package QuickSort;

public class PracticaQuick {

	public static int  Particionar(int[] arreglo,int primero, int ultimo) {
		// mitad del elemento y colocacion del pivote al final 
		int objetivo= ((primero+ultimo)/2);  //pivote 
		arreglo[ultimo] = objetivo;
		arreglo[objetivo] = ultimo;  
		for (int i : arreglo) {
			System.out.print(i+" ");
		}
		return objetivo;
	}
	public static void Ordenar() {
		
	}
	
	public static void QuickSorte(int[] arreglo,int primero, int ultimo) {// elemento minimo y maximo 
		
		int i = primero;
		int j = ultimo;
		int aux;
		
		 int momory = Particionar(arreglo, primero, ultimo);
		 System.out.println(".."+momory+"..");
		while (i>=j) {
			System.out.println("hola ");
		} 
	
		
	}
	
	public static void main(String[] args) {
		int[] arreglo = {3, 3, 2, 1, 4};
		QuickSorte(arreglo, 0, arreglo.length-1);
	}

}
