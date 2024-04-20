package galeria.structurer_inventario;

import Inventario.Pieza;

public class Venta {
	private double precio;
	private boolean aceptada;
	//private externo externo;
	private boolean facturada;
	private Pieza pieza;
	
	public Venta(double precio, boolean aceptada, boolean facturada) {
		super();
		this.precio = precio;
		this.aceptada = aceptada;
		this.facturada = facturada;
	}
	
	public void setAceptada(boolean aceptada){
		this.aceptada =aceptada;
	}
	public void setFacturada(boolean aceptada){
		this.aceptada =aceptada;
	}

	public double getPrecio() {
		return precio;
	}

	public boolean isAceptada() {
		return aceptada;
	}

	public boolean isFacturada() {
		return facturada;
	}

	public Pieza getPieza() {
		return pieza;
	}
	
}
