package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SquareTest {
	
	private Square square;
	
	@BeforeEach
	
	public void setUp() throws Exception{
		
		//Nuevo cuadrado 
		
		square = new Square();
		square.setMeasures(2);//Se setean las medidas del cuadrado
	}
	
	@Test
	
	/*
	 * 
	 * Se testea el seteo de las medidas
	 * 
	 */
	
	void testSetMeasures() {
		
		int a = square.getLength();
		int b = square.getWidth();
		
		assertEquals(a,2);
		assertEquals(b,2);
		
	}
	

	@Test
	void testNewSquare() {
		square.create(2,8);
		
		Point pointA = square.getTopLeft();   	// Se extrae el punto superior izquierdo 
		Point pointB = square.getTopRight();		// Se extrae el punto superior derecho
		Point pointC = square.getBottomLeft();	// Se extrae el punto inferior izquierdo
		Point pointD = square.getBottomRight();	// Se extrae el punto superior derecho
		
		int a = pointA.getX();		// Se extrae el valor de X del punto superior izquierdo
		int b = pointA.getY();		// Se extrae el valor de Y del punto superior izquierdo
		
		int c = pointB.getX();		// Se extrae el valor de X del punto superior derecho
		int d = pointB.getY();		// Se extrae el valor de Y del punto superior derecho
		
		int e = pointC.getX(); 		// Se extrae el valor de X del punto inferior izquierdo
		int f = pointC.getY();		// Se extrae el valor de Y del punto inferior izquierdo
		
		int g = pointD.getX();		// Se extrae el valor de X del punto inferior derecho
		int h = pointD.getY();		// Se extrae el valor de Y del punto inferior derecho

		assertEquals(a,2);
		assertEquals(b,8);
		
		assertEquals(c,4);
		assertEquals(d,8);
		
		assertEquals(e,2);
		assertEquals(f,6);
		
		assertEquals(g,4);
		assertEquals(h,6);
				
		
	}

}
