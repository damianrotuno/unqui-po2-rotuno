package ar.edu.unq.po2.tp4;

public class IngresoPorHsExtras extends Ingresos{
	
	private double cantHs;
	
	
	public IngresoPorHsExtras(String m, String concepto, double monto) {
		super(m, concepto, monto);
	}

	public double getMontoImponible() {
		return 0;
	}

	public double getCantHs() {
		return cantHs;
	}

	public void setCantHs(double cantHs) {
		this.cantHs = cantHs;
	}
	
	
	
	
	
	
}
