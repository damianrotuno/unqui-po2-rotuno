package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MercadoCentralTest {
	
	private Mercado mercadoCentral;
	private Producto arroz;
	private Cooperativo leche;
	private Cooperativo vino;
	private Producto fideos;
	private Servicio edesur;
	private Impuesto municipal;
	
	@BeforeEach
	
	void SetUp() throws Exception{
		
		/*
		 * Se setean los productos, tanto los tradicionales como los cooperativos
		 */
		mercadoCentral = new Mercado();
		arroz  = new Producto("Asiatico",150,200);
		leche  = new Cooperativo("Trabajadores Unidos",50,1000);
		leche.setPrecioConDescuento();
		vino   = new Cooperativo("Amargo Obrero",100,50);
		vino.setPrecioConDescuento();
		fideos = new Producto("Don Vicente",200,110);
		
		/*
		 * se setean los servicios y los impuestos
		 */
		edesur 		= new Servicio(100,5);
		municipal 	= new Impuesto(300); 
		
		/*
		 * Se setea una agencia
		 */
		
	}
	
	@Test
	
	/*
	 * Se testea que el stock de cada producto se decremente como corresponde
	 */
	
	void testDecrementarStock() {
		
		mercadoCentral.agregarProducto(arroz);
		mercadoCentral.agregarProducto(arroz);
		mercadoCentral.agregarProducto(arroz);
		mercadoCentral.agregarProducto(leche);
		mercadoCentral.agregarProducto(fideos);
		
		int a = arroz.getStock();
		int l = leche.getStock();
		int v = vino.getStock();
		int f = fideos.getStock();
		
		
		assertEquals(a,197);
		assertEquals(l,999);
		assertEquals(v,50);
		assertEquals(f,109);
		
	}
	
	@Test
	
	/*
	 * Se testean los precios de los productos
	 */
	
	void testPrecios() {
		double a = arroz.getPrecio();
		double l = leche.getPrecio();
		double v = vino.getPrecio();
		double f = fideos.getPrecio();
		
		assertEquals(a,150);
		assertEquals(l,45);
		assertEquals(v,90);
		assertEquals(f,200);
		
	}
	
	@Test
	
	/*
	 * Se testea que el monto a cobrar al cliente sea el correcto
	 */
	
	void testMontoACobrar() {
		
		mercadoCentral.agregarProducto(arroz);
		mercadoCentral.agregarProducto(arroz);
		mercadoCentral.agregarProducto(arroz);
		mercadoCentral.agregarProducto(fideos);
		mercadoCentral.agregarProducto(leche);
		
		double p = mercadoCentral.getMontoACobrar();
		
		assertEquals(p,695);
		
	}
	
	@Test
	
	/*
	 * Se testea el correcto calculo de los impuestos y los servicios
	 */
	
	void testMontoACobrar2() {
		double a = edesur.getMontoACobrar();
		double b = municipal.getMontoACobrar();
			
		assertEquals(a,500);
		assertEquals(b,300);
	}
	
	@Test
	/*
	 * Se testea que el impuesto y servicio se agregue correctamente a la lista de facturas
	 */
	
	void testAgregarALista() {
		Factura f1;
		Factura f2;
		
		f1 = new Factura("001","Edesur",500);
		f2 = new Factura("002","Municipal",300);
		
		mercadoCentral.listaDeFacturas.add(f1);
		mercadoCentral.listaDeFacturas.add(f2);
		
		int x = mercadoCentral.listaDeFacturas.size();
		
		assertEquals(x,2);
		
	}
	
	
	
}
