package cl.awakelab.simulacion;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import cl.awakelab.simulacion.chequeotiempos.AtencionUrgencia;

class AtencionUrgenciaTest {

	@Test
	void test1() {
		AtencionUrgencia au = new AtencionUrgencia("PAA","DAA",3,3,3);
		assertEquals(au.calcularTiempo(),33);

	}

	@Test
	void test2() {
		AtencionUrgencia au = new AtencionUrgencia("PAA","DAA",2,2,2);
		assertEquals(au.calcularTiempo(),27);

	}
	
}
