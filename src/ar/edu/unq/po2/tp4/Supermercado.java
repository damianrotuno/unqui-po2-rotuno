package ar.edu.unq.po2.tp4;

import java.util.ArrayList;

public class Supermercado {

	private String nombre;
	private String direccion;
	private ArrayList<Producto> lista = new ArrayList();
	private double total = 0; 
	
	public Supermercado(String n, String dir) {
		this.setNombre(n);
		this.setDireccion(dir);
	}
	
	public void setNombre(String n) {
		nombre = n;
	}
	
	public void setDireccion(String dir) {
		direccion = dir;
	}
	
	public void agregarProducto(Producto p) {
		lista.add(p);
	}
	
	public int getCantidadDeProductos() {
		return lista.size();
	}
	
	public double getPrecioTotal() {

		for(Producto prod : lista) {
			total = total + prod.getPrecio();
		}
		
		return total;
	}
	
}
