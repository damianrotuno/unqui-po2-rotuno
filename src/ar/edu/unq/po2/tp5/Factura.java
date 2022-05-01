package ar.edu.unq.po2.tp5;

public class Factura {
	private String nro;
	private String tipo;
	private double importe;
	
	public Factura(String n, String t, double i) {
		this.setNro(n);
		this.setTipo(t);
		this.setImporte(i);
	}

	public String getNro() {
		return nro;
	}

	public void setNro(String nro) {
		this.nro = nro;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String t) {
		this.tipo = t;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double i) {
		this.importe = i;
	}
		
}
