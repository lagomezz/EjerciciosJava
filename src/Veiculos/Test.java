package Veiculos;

public class Test {

	public static void main(String[] args) {

		Vehicle vehiculo = new Vehicle();
		Car coche = new Car();
		vehiculo.drive();
		coche.drive();
		coche= null;
		vehiculo= coche;
		vehiculo.drive();
		
	}

}
