package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto{
	
	private double desc;
	private double precioProductoPrimeraNecesidad;
	
	public ProductoPrimeraNecesidad(String n, double p) {
		super(n, p);
	}
	
	public ProductoPrimeraNecesidad(String n, double p, boolean pc) {
		super(n, p, pc);
	}

	public void setDescuento(double d) {
		desc = (100 - d)/100;
	}
	
	public double getDescuento() {
		return desc;
	}
	
	public void setPrecioConDescuento() {
		precioProductoPrimeraNecesidad = this.getPrecio() * this.getDescuento();
		this.setPrecio(precioProductoPrimeraNecesidad);
	}
	
	
	
	
	
	
	

}
