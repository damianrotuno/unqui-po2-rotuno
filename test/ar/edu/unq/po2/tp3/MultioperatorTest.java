package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultioperatorTest {
	
	private Multioperator multioperator;
	
	@BeforeEach
	
	public void setUp() throws Exception{
		
		//Se crea el multioperador
		
		multioperator = new Multioperator();
		
		//Se agregan los numeros a la lista
		
		multioperator.addNumber(10);
		multioperator.addNumber(31);
		multioperator.addNumber(87);
		multioperator.addNumber(78);
		
	}

	@Test
	void testAddThemAll() {
		int n = multioperator.addThemAll();
		
		assertEquals(n,206);
				
	}
	
	@Test
	void testSubstractAll() {
		int n = multioperator.substracAll();
		
		assertEquals(n,-206);
				
	}
	
	@Test
	void testMultipliesAll() {
		int n = multioperator.multipliesAll();
		
		assertEquals(n,2103660);
				
	}

}
