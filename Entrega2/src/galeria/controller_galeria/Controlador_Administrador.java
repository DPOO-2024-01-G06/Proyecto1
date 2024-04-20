package galeria.controller_galeria;

import java.util.List;

import galeria.Galeria;
import galeria.structurer_inventario.Pieza;
import galeria.structurer_inventario.Venta;
import galeria.structurer_usuarios.Interno;

public class Controlador_Administrador {
	private Interno interno;
	private Galeria galeria;
	
	public Controlador_Administrador(Interno interno, Galeria galeria) {
		this.interno = interno;
		this.galeria = galeria;
	}
	public void ingresarPieza(Pieza pieza) {
		//TODO
	}
	public List<Pieza> getInventario(){
		return null;
	}
	public List<Venta> getVentasPorAceptar(){
		return null;
	}
	public void confirmarVenta() {
		
	}
	
	
	
	
	
}
