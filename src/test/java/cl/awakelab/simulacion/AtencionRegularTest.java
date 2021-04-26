package cl.awakelab.simulacion;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import cl.awakelab.simulacion.chequeotiempos.AtencionRegular;

public class AtencionRegularTest {

	@Test
	public void test1() {
		AtencionRegular ar = new AtencionRegular("PP", "DD", 0, 1);
		assertEquals(ar.calcularTiempo(),15);
	} 
	
	@Test
	public void test2() {
		AtencionRegular ar = new AtencionRegular("PP", "DD", 0, 4);
		assertEquals(ar.calcularTiempo(),25);		
	}
	
}
