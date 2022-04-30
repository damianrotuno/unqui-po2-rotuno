package ar.edu.unq.po2.tp4;

import java.util.ArrayList;

public class Trabajador {
	
	private ArrayList<Ingresos> ingresos = new ArrayList();
	private double totalPercibido;
	private double totalImponible;
	private double impuestoAlTrabajador = 2;
	
	public Trabajador() {
	}
	
	public void setIngresos(Ingresos i) {
		ingresos.add(i);
	}
	
	public double getTotalPercibido() {
		for(Ingresos ingreso:ingresos) {
			totalPercibido += ingreso.getMonto();
		}
			return totalPercibido;
	}
	
	public double getMontoImponible() {
		for(Ingresos ingreso:ingresos) {
			totalImponible += ingreso.getMontoImponible();
		}
			return totalImponible;
	}
	
	public double getImpuestoAPagar() {
		return this.getMontoImponible() * (impuestoAlTrabajador/100);
	}

}
