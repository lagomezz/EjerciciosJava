package PreguntasDeExamen2;

public class Pregunta3 {

	public static void main(String[] args) {
		//¿Cuál de las siguientes opciones devolverá la posición de la primera letra a donde la cadena s contiene "banana"?
		/*		 
		    lastIndexOf(2,s); // mala
		    s.indexOf('a'); 
		    s.charAt(2);
		    indexOf(s,'v');
		 */
		
		String s = "banana";
		
		System.out.println(s.lastIndexOf(2));
		System.out.println(s.indexOf('a'));
		System.out.println(s.charAt(2));
		System.out.println(s.indexOf('v'));
		/*
		 Nota
			El método lastIndexOf toma un solo argumento de char.
			El método charAt devuelve la letra en la posición.
		 */
	}

}
