package pooallFunctions;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import models.Calcul;

public class SommeTest {
	
	@Test
	public void testSomme() {
		
		Calcul c = new Calcul();
		
		assertEquals("", 10.0, c.somme(5, 5), 0.0);
	}

}
