package ejersicios;

public class ejercicio3 {

	public static void main(String[] args) {
		//24) Recorre el String del ejercicio 22 y transforma cada carácter a su código ASCII. 
		//Muestralos en linea recta, separados por un espacio entre cada carácter.
		String frace = "luis armando gomez jimenez";
		char vocales;
		int contador= 0;
		//arreglo que cuentas cuantas vocales hay en una cadena 
		for (int i = 0; i < frace.length(); i++) {
		    System.out.println("el codigo ASII DEL CARACTER " + frace.charAt(i) +" el codigo ASII ES  "+ frace.codePointAt(i));
		}
		
	}

}
