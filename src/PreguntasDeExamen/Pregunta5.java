package PreguntasDeExamen;


public class Pregunta5 {
	static int total = 10;
	public static void main(String[] args) {
		divide(2,0);
		
	}
	public static  void divide(int a, int b) {
		try {
			int c = a/b;
		} catch (Exception e) {
			
			return;
			
		}finally {
			System.out.print("Finalizado");
		}
	}
	

}
