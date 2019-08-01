package BinarySearch;

public class iterale {

	public static int binarySearch(int search, int[] array) {

		int start = 0;
		int end = array.length - 1;

		while (start <= end) {
			
			int middle = (start + end) / 2;
			
			if (search < array[middle]) {
				end = middle - 1;
			}

			if (search > array[middle]) {
				start = middle + 1;
			}
			
			if (search == array[middle]) {
				return middle;
			}
		}
		return -1;

	}
	public static void main(String[] args) {
		
		int[] arreglo = {2,5,7,5,545454,4,5,2,1,5,2,3,5455,3,1,3,6,8,7,6,5,3,4,6};
		
		int search = 2;
		System.out.println(binarySearch(search, arreglo));
		
	}
}
