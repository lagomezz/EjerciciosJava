package PreguntasDeExamen2;

public class Pregunta3 {

	public static void main(String[] args) {
		//�Cu�l de las siguientes opciones devolver� la posici�n de la primera letra a donde la cadena s contiene "banana"?
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
			El m�todo lastIndexOf toma un solo argumento de char.
			El m�todo charAt devuelve la letra en la posici�n.
		 */
	}

}
