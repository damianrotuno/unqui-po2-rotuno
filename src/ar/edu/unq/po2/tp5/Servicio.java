package ar.edu.unq.po2.tp5;

public class Servicio implements Cobrable {
	
	private double costoXUnidad;
	private int unidadesConsumidas;
	
	public Servicio(double costo, int u) {
		this.setCostoXUnidad(costo);
		this.setUnidadesConsumidas(u);
	}
	
	public double getCostoXUnidad() {
		return costoXUnidad;
	}
	public void setCostoXUnidad(double costo) {
		this.costoXUnidad = costo;
	}
	public int getUnidadesConsumidas() {
		return unidadesConsumidas;
	}
	public void setUnidadesConsumidas(int u) {
		this.unidadesConsumidas = u;
	}
	
	public double getMontoACobrar() {
		return this.getCostoXUnidad() * this.getUnidadesConsumidas();
	}

}
