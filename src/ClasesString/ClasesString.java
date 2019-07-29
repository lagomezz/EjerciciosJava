package ClasesString;

public class ClasesString {
	public static void main(String[] args) {
		String demo = "Hola"; // El objeto anterior se almacena en la Constant String Pool y 
		//su valor no se puede modificar.

		demo = "Adi�s"; // El nuevo String "Adi�s" se crea en la Constant String Pool y 
		//es referenciado por la variable demo

		//El String "Hola" todav�a existe en la Constant String Pool y su valor no se sobreescribe
		//pero perdimos la referencia al String "hola"
		System.out.println(demo);
	} 

}
