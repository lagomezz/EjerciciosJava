import java.util.Arrays;

public class Ordenamiento {
	public static void main(String[] args) {
		int[] arreglo = {1,0,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,0,0,0,1,1,1,1,1 };

		optimizedBubbleSort(arreglo);
		for (int pivote : arreglo) {
			System.out.print(" "+pivote);
		}
	}

	private static void optimizedBubbleSort(int[] list) {
		for (int i = 0; i < list.length; i++) {
			boolean sorted = true; // asumo que para la iteraci�n i el listado es ordenado,
			for (int j = 0; j < list.length - i - 1; j++) { // en cada iteraci�n los elementos desde la posici�n
															// (length-i) estan ordenados, por lo tanto solo recorro
															// hasta esa posici�n
				if (list[j] > list[j + 1]) {
					int temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
					sorted = false;
				}
			}
			if (sorted) {
				System.out.println(String.format("Iteraci�n %s, array ordenado", i));
				System.out.println("resultado " + i);
				return;
			}
		}
	}
}
