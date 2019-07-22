package ejersicios;

public class ejersicio2 {

	public static void main(String[] args) {
		//22) Del siguiente String “La lluvia en Sevilla es una maravilla” cuenta cuantas vocales hay en 
		//total (recorre el String con charAt).
		String frace = "luis armando gomez jimenez";
		char vocales;
		int contador= 0;
		//arreglo que cuentas cuantas vocales hay en una cadena 
		for (int i = 0; i < frace.length(); i++) {
			vocales = frace.charAt(i);
			//System.out.println(vocales);
			if ((vocales=='a')|| (vocales=='e')||(vocales=='i')||(vocales=='o')||(vocales=='u') ){
				contador++;
			}
		}
		// este metodo remplaza las letras e por las letras a 
		System.out.println(frace.replace('e', 'a'));
		// devuelve la informacion del arreglo anterior
		System.out.println("contiene este numero de vocales "+ contador);
		System.out.println(frace);
	}
}

