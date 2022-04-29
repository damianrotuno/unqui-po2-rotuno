package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Empresa {
	
	private String name;
	private int cuit;
	private int montoTotalRetenciones;
	private int montoTotalBruto;
	private ArrayList<Empleado> empleados = new ArrayList();
	private ArrayList<Liquidacion> recibos = new ArrayList();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCuit() {
		return cuit;
	}

	public void setCuit(int cuit) {
		this.cuit = cuit;
	}
	
	public int montoTotalNeto() {
		int monto;
		
		monto = this.getMontoTotalBruto() - this.getMontoTotalRetenciones();
		return monto;
	}
	
	public void setMontoTotalBruto() {
		int montoTotalBruto = 0;
		for(Empleado empleado = null;;) {
			montoTotalBruto = empleado.getSueldoBruto() + montoTotalBruto;
		}
		
	}
	
	public int getMontoTotalBruto(){
		return montoTotalBruto;
	}
	
	public void setMontoTotalRetenciones() {
		int montoTotalRetenciones = 0;
		for(Empleado empleado = null;;) {
			montoTotalRetenciones = empleado.getRetenciones() + montoTotalRetenciones;
		}
		
	}
	
	public int getMontoTotalRetenciones() {
		return montoTotalRetenciones;
	}
	
	public int guardaRecibo() {
		
		for(Empleado empleado = null;;) {
			Liquidacion nuevoRecibo = new Liquidacion(empleado.name,empleado.address,LocalDate.now(),empleado.getSueldoBruto(),empleado.getSueldoNeto());
			recibos.add(nuevoRecibo);
		}
	}

}
