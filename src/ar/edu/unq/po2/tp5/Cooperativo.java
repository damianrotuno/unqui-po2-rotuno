package ar.edu.unq.po2.tp5;

public class Cooperativo extends Producto{
	
	private double descuento = 10;
	private double precioConDescuento;
	
	public Cooperativo(String n, double p, int s) {
		super(n, p, s);
	}
	
	public double getDescuento() {
		return descuento;
	}
	
	public void setPrecioConDescuento() {
		precioConDescuento = this.getPrecio() - (this.getPrecio() * (this.getDescuento()/100));
		this.setPrecio(precioConDescuento);
	}
	
	public double getPrecioConDescuento() {
		return precioConDescuento;
	}

	
	
	
	
	
	
	

}
