package ar.edu.unq.po2.tp4;

public class Producto {
	
	private String nombre;
	private double precio;
	private boolean precioCuidado = false;

	public Producto(String n, double p, boolean pc) {
		this.setNombre(n);
		this.setPrecio(p);
		this.setPrecioCuidado(pc);
	}
	
	public Producto(String n, double p) {
		this.setNombre(n);
		this.setPrecio(p);
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
	
	public void setPrecioCuidado(boolean pc) {
		precioCuidado = pc;
	}
	
	public boolean esPrecioCuidado() {
		return precioCuidado;
	}
	
	public void aumentarPrecio(double aumento) {
		precio += aumento;
	}

}
