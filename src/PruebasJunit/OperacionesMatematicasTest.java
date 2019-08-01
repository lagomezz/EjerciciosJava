package PruebasJunit;

import static org.junit.Assert.*;

import org.junit.Test;

public class OperacionesMatematicasTest {
	OperacionesMatematicas obj=new OperacionesMatematicas(); 
	
	@Test
	public void TestSuma() {
		int valor1 = obj.Suma(2,4);
		int valor2 = 6;
		assertEquals(valor2, valor1);
	}
}
