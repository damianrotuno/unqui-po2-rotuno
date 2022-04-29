package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

 	public class Empleado {
	
	public String name;
	public String address;
	public String estadoCivil;
	public LocalDate dateOfBirth;
	public int sueldoBruto;
	public int retenciones;
	
	public Period edad() {
		Period edad = (Period.between(this.dateOfBirth, LocalDate.now()));
		return edad;
	}
	
	
	
	public void setDateOfBirth(LocalDate fecha) {
		dateOfBirth = fecha;
	}
	
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	
	public int getSueldoBruto() {
		return this.sueldoBruto;
	}

	public int getRetenciones() {
		return this.retenciones;
	}
	
	public int getSueldoNeto() {
		return this.getSueldoBruto() - this.getRetenciones();
	}

	

}
