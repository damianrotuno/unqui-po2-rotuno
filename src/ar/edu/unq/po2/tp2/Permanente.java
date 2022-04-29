package ar.edu.unq.po2.tp2;

public class Permanente extends Empleado{
	
	public int hijos;
	public int antiguedad;
	/*public int sueldoBruto;
	public int retenciones;*/
	

	public void setCantHijos(int cant) {
		hijos = cant;
	}
	
	public int getCantHijos() {
		return this.hijos;
	}
	
	public void setAntiguedad(int cant) {
		antiguedad = cant;
	}
	
	public int getAntiguedad() {
		return this.antiguedad;
	}
	
	public void setSueldoBruto() {
		sueldoBruto = this.asignacionPorHijo() + this.asignacionPorConyuge() + this.cantPorAntiguedad();
	}
	
	/*public int getSueldoBruto() {
		return this.sueldoBruto;
	}*/
	
	public int asignacionPorHijo() {
		return hijos*150;
	}
	
	public int asignacionPorConyuge() {
		if(this.estadoCivil == "Casado") {
			return 100;
		}
		return 0;
	}
	
	public int cantPorAntiguedad() {
		return antiguedad*50;
	}
	
	public void setRetenciones() {
		retenciones = this.obraSocial() + this.aportePorHijo() + this.aportesJubilatorios(); 
	}
	
	/*public int getRetenciones() {
		return this.retenciones;
	}*/
	
	public int obraSocial() {
		return (sueldoBruto*10)/100;
	}
	
	public int aportePorHijo() {
		return 20*this.getCantHijos();
	}
	
	public int aportesJubilatorios() {
		return (sueldoBruto*15)/100;
	}
	
	
}
