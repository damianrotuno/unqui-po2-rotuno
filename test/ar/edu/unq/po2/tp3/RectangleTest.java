package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RectangleTest {

	private Rectangle rectangle;
	
	@BeforeEach
	
	public void setUp() throws Exception{
		
		//Nuevo rectangulo
		
		rectangle = new Rectangle();
		rectangle.setMeasure(10, 4); //Se setean las medidas del rectangulo
	}
	
	@Test
	
	/*
	 * 
	 * Se testea el seteo de las medidas
	 * 
	 */
	
	void testSetMeasures() {
		
		int a = rectangle.getLength();
		int b = rectangle.getWidth();
		
		assertEquals(a,10);
		assertEquals(b,4);
		
	}
	
	@Test
	
	/*
	 * 
	 * Se testea la creacion de un rectangulo apropiado y consistente
	 * 
	 */
	
	void testNewRectangle() {		
		rectangle.create(2,8); // Se crea el rectangulo
		
		Point pointA = rectangle.getTopLeft();   	// Se extrae el punto superior izquierdo 
		Point pointB = rectangle.getTopRight();		// Se extrae el punto superior derecho
		Point pointC = rectangle.getBottomLeft();	// Se extrae el punto inferior izquierdo
		Point pointD = rectangle.getBottomRight();	// Se extrae el punto superior derecho
		
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
		
		assertEquals(c,12);
		assertEquals(d,8);
		
		assertEquals(e,2);
		assertEquals(f,4);
		
		assertEquals(g,12);
		assertEquals(h,4);
		
	}
	
	@Test
	
	/*
	 * 
	 * Se testea el calculo del area del rectangulo
	 * 
	 */
	
	void testGetArea() {
		rectangle.setArea();
		int a = rectangle.getArea();
		
		assertEquals(a,40);
	}
	
	@Test
	/*
	 * 
	 * Se testea el calculo del perimetro del rectangulo
	 * 
	 */
	
	void testGetPerimeter() {
		rectangle.setPerimeter();
		int a = rectangle.getPerimeter();
		
		assertEquals(a,28);
	}
	
	@Test
	/*
	 * 
	 * Se testea si el rectangulo es horizontal o vertical
	 * 
	 */
	
	void testIsHorizontal() {
		boolean x = rectangle.isHorizontal();
		
		assertEquals(x,true);
	}
	
	
}
