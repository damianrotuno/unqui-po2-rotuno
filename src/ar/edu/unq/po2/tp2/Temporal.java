package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class Temporal extends Empleado {

	public LocalDate designacion;
	public int hsExtras;
	/*public int retenciones;
	public int sueldoBruto;*/
	
	
	public void setFechaDeDesignacion(LocalDate fecha) {
		designacion = fecha;
	}
	
	public LocalDate getFechadeDesignacion() {
		return designacion;
	}
	
	public void setHsExtras(int cant) {
		hsExtras = cant;
	}
	
	public int getHsExtras() {
		return hsExtras;
	}
	
	public int montoHsExtras() {
		return  this.getHsExtras() * 40;
	}
	
	public void setSueldoBruto() {
		sueldoBruto = this.montoHsExtras() + this.getRetenciones();
	}
	
	/*public int getSueldoBruto() {
		return sueldoBruto;
	}*/
	
	public void setRetenciones() {
		retenciones = this.obraSocial() + this.aportePorEdad() + this.aportesJubilatorios();
	}
	
	/*public int getRetenciones() {
		return this.retenciones;
	}*/
	
	public int obraSocial() {
		return (sueldoBruto*10)/100;
	}
	
	public int aportesJubilatorios() {
		return ((sueldoBruto*10)/100) + 5 * this.getHsExtras();
	}
	
	public int aportePorEdad() {
		if(this.esMayorDe50()) {
			return 25;
		}
			return 0;
	}
	
	public boolean esMayorDe50() {
		if (this.edad() > 50) {
			return true;
		}
			return false;
				
	}
}
