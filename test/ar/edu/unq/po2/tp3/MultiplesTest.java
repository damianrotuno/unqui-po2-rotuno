package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultiplesTest {

	private Multiples multiples;
	

	@BeforeEach

	public void setUp() throws Exception{
		
		multiples = new Multiples();
	}
	
	@Test
	
	/*
	 * Se testea que retorne el numero mas alto entre dos numeros x e y, que sea multiplo
	 * simultaneamente entre x e y.
	 * 
	 */
	
	public void majorMultiplotBetween(){ 
		int m = multiples.majorMultiplotBetween(3,9);
		
		assertEquals(m,999);
					
	}
	
	/*
	 * 
	 * Se testea que retorne -1 al no encontar un multilo simultaneo entre dos numeros x e y.
	 * 
	 */
	
	public void notMultiplotBetween(){ 
		int m = multiples.majorMultiplotBetween(2,9);
		
		assertEquals(m,-1);
					
	}
	
	

}
