package ar.edu.unq.po2.tp4;

public class Ingresos {
	
	private String mes;
	private String concepto;
	private double monto;
	
	public Ingresos(String m, String concepto, double monto) {
		this.setMes(m);
		this.setConcepto(concepto);
		this.setMonto(monto);
	}

	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	
	public double getMontoImponible() {
		return monto;
	}
	
	
}	
