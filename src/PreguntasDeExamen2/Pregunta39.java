package PreguntasDeExamen2;
//�Cu�l es la salida del siguiente c�digo?
/*
 * Posibles respuestas
 * 
    javZ2sAa
    jZvZ2sAa
    jZv
    jZvZ2s
    jZvZ

 */
public class Pregunta39 {
	public static void main(String[] args) {
		 String s = "java2s".replace('a', 'Z').trim().concat("Aa");
		    s.substring(0, 2);
		    System.out.println(s);
	}
}// la salida del codigo es javZ2sAa

/*
 * Nota
Cuando se encadenan, los m�todos se eval�an de izquierda a derecha.
El primer m�todo para ejecutar es reemplazar, no concat.
Llamar al m�todo subcadena en la variable de referencia s no cambia el contenido de la variable s. 
 */

