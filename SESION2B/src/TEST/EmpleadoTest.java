package TEST;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import PARTEB.Empleado;
import PARTEB.TipoEmpleado;

class EmpleadoTest {
	private Empleado empleado;

	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Iniciando batería de pruebas para Empleado...");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Batería de pruebas finalizada.");
	}

	
	@BeforeEach
	void setUp() throws Exception {
		empleado = new Empleado(); 
	}

	
	@AfterEach
	void tearDown() throws Exception {
		empleado = null; 
	}

	
	@Test
	void testCalculoNominaBruta_VentasDebajoDe1000() {
		TipoEmpleado tipo = new TipoEmpleado("Vendedor", 0);
		float resultado = empleado.calculoNominaBruta(tipo, 999.0f, 0f);
		assertEquals(2000.0f, resultado, 0.01f);
	}

	@Test
	void testCalculoNominaBruta_VentasExactamente1000() {
		TipoEmpleado tipo = new TipoEmpleado("Vendedor", 0);
		float resultado = empleado.calculoNominaBruta(tipo, 1000.0f, 0f);
		assertEquals(2100.0f, resultado, 0.01f);
	}

	@Test
	void testCalculoNominaBruta_VentasDebajoDe1500() {
		TipoEmpleado tipo = new TipoEmpleado("Vendedor", 0);
		float resultado = empleado.calculoNominaBruta(tipo, 1499.0f, 0f);
		assertEquals(2100.0f, resultado, 0.01f);
	}

	@Test
	void testCalculoNominaBruta_VentasExactamente1500() {
		TipoEmpleado tipo = new TipoEmpleado("Vendedor", 0);
		float resultado = empleado.calculoNominaBruta(tipo, 1500.0f, 0f);
		assertEquals(2200.0f, resultado, 0.01f);
	}

	@Test
	void testCalculoNominaBruta_EncargadoConHorasExtra() {
		TipoEmpleado tipo = new TipoEmpleado("Encargado", 0);
		float resultado = empleado.calculoNominaBruta(tipo, 0f, 2f);
		assertEquals(2560.0f, resultado, 0.01f);
	}

	@Test
	void testCalculoNominaNeta_MenorDe2100() {
		float resultado = empleado.calculoNominaNeta(2099.0f);
		assertEquals(2099.0f, resultado, 0.01f);
	}

	@Test
	void testCalculoNominaNeta_Exactamente2100() {
		float resultado = empleado.calculoNominaNeta(2100.0f);
		assertEquals(1785.0f, resultado, 0.01f);
	}

	@Test
	void testCalculoNominaNeta_DebajoDe2500() {
		float resultado = empleado.calculoNominaNeta(2499.0f);
		assertEquals(2124.15f, resultado, 0.01f);
	}

	@Test
	void testCalculoNominaNeta_Exactamente2500() {
		float resultado = empleado.calculoNominaNeta(2500.0f);
		assertEquals(2050.0f, resultado, 0.01f);
	}

}
