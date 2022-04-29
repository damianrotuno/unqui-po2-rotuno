package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PointTest {
	
	private Point pointA;
	private Point pointB;

	@BeforeEach
	
	public void setUp() throws Exception{
		
		//Nuevo punto
		
		pointA = new Point();
		pointB = new Point(1,4);
		
	}
	
	@Test
	/*
	 * Se testea que un nuevo punto sin pasarle datos de un punto 0,0
	 */
	
	void testNuevoPunto() {
		int a =  pointA.getX();
		int b =  pointA.getY();
		
		assertEquals(a,0);
		assertEquals(b,0);
	}
	
	@Test
	/*
	 * Se testea que un nuevo punto se cree con los puntos que se le asignan
	 */
	
	void testNuevoPuntoConDatos() {
		int a =  pointB.getX();
		int b =  pointB.getY();
		
		assertEquals(a,1);
		assertEquals(b,4);
	}
	
	@Test
	/*
	 * Se testea que el correcto movimiento de un punto hacia el nuevo lugar designado
	 */
	
	void testNuevaPosicion() {

		pointB.movePointTo(5, 7);
		
		int a =  pointB.getX();
		int b =  pointB.getY();
		
		assertEquals(a,5);
		assertEquals(b,7);
	}
	
	@Test
	
	/*
	 * Se testea la suma entre dos puntos, creando un nuevo punto
	 * 
	 */
	
	void testSumaDePuntos() {
		Point pointC = new Point(1,1);
		
		pointB.addPoint(pointC);
		
		Point pointD = pointB.getNewPoint();
		
		int a = pointD.getX();
		int b = pointD.getY();
		
		assertEquals(a,2);
		assertEquals(b,5);
		
	}
	

}
