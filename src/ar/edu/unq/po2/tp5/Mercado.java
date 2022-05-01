package ar.edu.unq.po2.tp5;

import java.util.ArrayList;

public class Mercado implements Cobrable,Agencia {
	
	private ArrayList <Producto> productosDelCliente =  new ArrayList();

	private double montoACobrar;
	
	public Mercado() {
		
	}
	
	public void agregarProducto(Producto p) {
		productosDelCliente.add(p);
		p.decrementarStock();
	}
	
	public double getMontoACobrar() {
		for(Producto prod:productosDelCliente){
			montoACobrar += prod.getPrecio();
		}
			return montoACobrar;
	}
	
	
}
