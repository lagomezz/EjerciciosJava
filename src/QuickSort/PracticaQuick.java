package QuickSort;

public class PracticaQuick {

	public static void Particionar(int[] arreglo,int objetivo, int ultimo) {
		// mitad del elemento y colocacion del pivote al final 
		arreglo[ultimo] = objetivo;
		arreglo[objetivo] = ultimo;  
		for (int i : arreglo) {
			System.out.print(i+" ");
		}
	}
	public static void Ordenar() {
		
	}
	
	public static void QuickSorte(int[] arreglo,int primero, int ultimo) {// elemento minimo y maximo 
		int objetivo= ((primero+ultimo)/2);  //pivote 
		int i = primero;
		int j = ultimo;
		int aux;
		System.out.println(ultimo);
		Particionar(arreglo, objetivo, ultimo);
		while (i>=j) {
			System.out.println("hola ");
		} 
	
		
	}
	
	public static void main(String[] args) {
		int[] arreglo = {3, 3, 2, 1, 4};
		QuickSorte(arreglo, 0, arreglo.length-1);
	}

}
