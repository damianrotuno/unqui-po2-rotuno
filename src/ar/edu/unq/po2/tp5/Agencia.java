package ar.edu.unq.po2.tp5;

import java.util.ArrayList;

public interface Agencia {
	
	public ArrayList<Factura> listaDeFacturas = new ArrayList();

	public static void registrarPago(Factura f) {
		listaDeFacturas.add(f);
	}
	
	
	public static ArrayList getLista() {
		return listaDeFacturas;
	}
}
