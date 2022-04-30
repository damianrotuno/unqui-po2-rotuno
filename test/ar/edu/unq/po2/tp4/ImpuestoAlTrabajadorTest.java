package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ImpuestoAlTrabajadorTest {

	private Trabajador a;
	private Trabajador b;
	private Trabajador c;
	
	@BeforeEach
	
	public void SetUp() throws Exception{
		
		/*
		 * Se setea el impuesto al trabajador
		 */
		
		/*
		 * Se setean los trabajadores
		 */
		
		 a = new Trabajador();
		 b = new Trabajador();
		 c = new Trabajador();
		
		/*		 
		 *Se setean los ingresos de los trabajadores
		 */
		
		Ingresos i1 = new Ingresos("Enero","Sueldo",1000);
		Ingresos i2 = new Ingresos("Enero","Sueldo",1500);
		Ingresos i3 = new Ingresos("Enero","Sueldo",3000);
		Ingresos i4 = new Ingresos("Enero","Comision",500);
		Ingresos i5 = new Ingresos("Enero","Comision",200);
		Ingresos i6 = new Ingresos("Enero","Comision",100);
		Ingresos i7 = new Ingresos("Enero","BonoObjetivo",5000);
		Ingresos i8 = new Ingresos("Enero","BonoObjetivo",2000);
		Ingresos i9 = new Ingresos("Enero","BonoObjetivo",1000);
		
		/*
		 * Se setean los ingresos por horas extras
		 */
		
		IngresoPorHsExtras  i10 = new IngresoPorHsExtras("Enero","TareaEspecial",1000);
		i10.setCantHs(10);
		IngresoPorHsExtras  i11 = new IngresoPorHsExtras("Enero","TareaEspecial",500);
		i11.setCantHs(5);
		IngresoPorHsExtras  i12 = new IngresoPorHsExtras("Enero","TareaEspecial",1100);
		i12.setCantHs(11);
		
		/*
		 * Se agregan los ingresos a los diferentes trabajadores
		 */
		
		a.setIngresos(i1);
		a.setIngresos(i4);
		a.setIngresos(i7);
		a.setIngresos(i10);
		
		b.setIngresos(i2);
		b.setIngresos(i5);
		b.setIngresos(i8);
		b.setIngresos(i11);
		
		c.setIngresos(i3);
		c.setIngresos(i6);
		c.setIngresos(i9);
		c.setIngresos(i12);
		
	}	
	@Test
	
	/*		 
	 *    Se testea el monto total percibido por cada trabajadores
	 */
		
		
	void testTotalPercibido() {
			
		double testA = a.getTotalPercibido();
		double testB = b.getTotalPercibido();
		double testC = c.getTotalPercibido();
		
		assertEquals(7500,testA);
		assertEquals(4200,testB);
		assertEquals(5200,testC);
		
	}
	
	@Test
	
	/*
	 * Se testea el monto total imponible por cada trabajador
	 */
	void testMontoImponible() {
		
		double testA = a.getMontoImponible();
		double testB = b.getMontoImponible();
		double testC = c.getMontoImponible();

		assertEquals(6500,testA);
		assertEquals(3700,testB);
		assertEquals(4100,testC);
	}
	
	@Test
	/*
	 * Se testea el impuesto a pagar por cada trabajador
	 */
	
	void testImpuestoAPagar() {
		
		double testA = a.getImpuestoAPagar();
		double testB = b.getImpuestoAPagar();
		double testC = c.getImpuestoAPagar();
		
		assertEquals(130,testA);
		assertEquals(74,testB);
		assertEquals(82,testC);
	
	}	
	
}
