package PreguntasDeExamen2;

public class Pregunts10 {
	public int i;
	//¿Cuál de las siguientes afirmaciones es correcta si reemplaza la línea de comentarios?
	/*
	 * 
    System.out.println(i);
    System.out.println(sc.i);
    System.out.println(Main.i);
    System.out.println((new Main()).i);

	 */
   public static void  main(String argv[]) {
	   Pregunts10 sc = new Pregunts10(); 

	    //System.out.println(i);
	    System.out.println(sc.i);// correcta 
	    //System.out.println(Pregunts10.i);
	    System.out.println((new Pregunts10()).i);// correcta
/*
 * Nota
	A es incorrecto, ya que las variables de instancia deben usarse con un objeto.
	C es incorrecto ya que las variables de instancia no se pueden usar con un nombre de clase ya que hay que instaciar la clase
 */
   }
}
