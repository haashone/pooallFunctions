package pooallFunctions;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import models.Calcul;

public class SommeTest {
	
	@Test
	public void testSomme() {
		
		Calcul c = new Calcul();
		assertNotNull(c);
		assertEquals("", 10.0, c.somme(5, 5), 0.0);
	}
	
	@Test
	public void testMultiplication() {
		
		Calcul c = new Calcul();
		assertNotNull(c);
		assertEquals("", 25.0, c.multi(5, 5), 0.0);
	}


}
