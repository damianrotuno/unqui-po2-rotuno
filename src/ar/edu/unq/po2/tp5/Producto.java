package ar.edu.unq.po2.tp5;

public class Producto {
	
	private String nombre;
	private double precio;
	private int stock;

	public Producto(String n, double p, int s) {
		this.setNombre(n);
		this.setPrecio(p);
		this.setStock(s);
	}
	
	public void setNombre(String n) {
		nombre = n;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setPrecio(double p) {
		precio = p;
	}
	
	public double getPrecio() {
		return precio;
	}

	
	public void setStock(int s) {
		stock = s;
	}
	
	public int getStock() {
		return stock;
	}
	
	public int decrementarStock() {
		return stock--;
	}

}
