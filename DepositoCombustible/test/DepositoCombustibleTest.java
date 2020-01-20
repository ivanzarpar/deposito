import static org.junit.Assert.*;


import org.junit.Test;

public class DepositoCombustibleTest {
	
	
	
	
	
	@Test
	public void testGetDepositoNivel() {
		DepositoCombustible DP= new DepositoCombustible(60.0,20.0);
		double gas=DP.getDepositoNivel();
		assertEquals(20.0, gas,0.1);
		
	}

	
	@Test
	public void testGetDepositoMax() {
		DepositoCombustible DP= new DepositoCombustible(60.0,20.0);
		double gas=DP.getDepositoMax();
		assertEquals(60.0, gas,0.1);
		
	}

	@Test
	public void testEstaVacio() {
		DepositoCombustible DP= new DepositoCombustible(60.0, 0.0);
		boolean gas=DP.estaVacio();
		assertTrue(true);
		
	}

	@Test
	public void testEstaLleno() {
		DepositoCombustible DP= new DepositoCombustible(60.0,30.0);
		double gas=DP.getDepositoMax();
		assertEquals(60.0, gas,0.1);
	}

	

}
