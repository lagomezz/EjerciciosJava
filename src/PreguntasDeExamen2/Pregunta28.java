package PreguntasDeExamen2;
//¿Cuál es la salida del siguiente código?
public class Pregunta28 {
	  public static void main(String args[]) { 
          StringBuilder s = new StringBuilder(10 + 2 + "ABC" + 4 + 5); 
          s.append(s.delete(3, 6)); 
          System.out.println(s); 
  } 
}
/*
 * Nota
		La siguiente línea de código devuelve 12ABC45:
		10 + 2 + "ABC" + 4 + 5 
		El operador + agrega dos números pero concatena los dos últimos números.
		Cuando el operador + encuentra un objeto String, trata todos los operandos restantes como objetos String.
		s.delete (3, 6) modifica el valor existente de StringBuilder a 12A5.
		Luego agrega el mismo valor a sí mismo cuando llama a s.append (), lo que da como resultado el valor 12A512A5.
 * 
 */
