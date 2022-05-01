package ar.edu.unq.po2.tp5;

public class Impuesto implements Cobrable {
	private double tasa;
	
	public Impuesto(double t) {
		this.setTasa(t);
	}

	public void setTasa(double t) {
		tasa = t;
	}
	
	public double getMontoACobrar() {
		return tasa;
	}
	
}	
