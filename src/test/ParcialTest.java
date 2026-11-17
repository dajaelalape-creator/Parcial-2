package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import logica.Parcial;

public class ParcialTest {
	
	private Parcial parcial;
	
	@BeforeEach
	public void setUp() {
		parcial = new Parcial();
	}
	
    @Test
	public void testCalcularPotencia() throws Exception {
		assertEquals(8, parcial.calcularPotencia(2, 3));
		assertEquals(100, parcial.calcularPotencia(10, 2));
		assertEquals(4, parcial.calcularPotencia(2, 2));
	}
	
	@Test
	public void testNegativos() {
		try {
			parcial.calcularPotencia(-2, 3);
		} catch (Exception e) {
			assertEquals("Base o exponente negativo", e.getMessage());
		}
		
		try {
			parcial.calcularPotencia(2, -3);
		} catch (Exception e) {
			assertEquals("Base o exponente negativo", e.getMessage());
		}
		
		try {
			parcial.calcularPotencia(-2, -3);
		} catch (Exception e) {
			assertEquals("Base o exponente negativo", e.getMessage());
		}
	}
	
	@Test
	public void testCero() throws Exception {
		assertEquals(0, parcial.calcularPotencia(0, 5));
	}
	
	@Test 
	public void testUno() throws Exception {
		assertEquals(1, parcial.calcularPotencia(5, 0));
	}
	
	@Test
	public void testAmbosCero() {
		try {
			parcial.calcularPotencia(0, 0);
		} catch (Exception e) {
			assertEquals("Base y exponente iguales a 0", e.getMessage());
		}
	}
	
	
	

}
