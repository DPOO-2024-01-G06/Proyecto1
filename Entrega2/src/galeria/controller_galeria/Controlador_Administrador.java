package galeria.controller_galeria;

import java.util.List;

import galeria.Galeria;
import galeria.structurer_inventario.Pieza;
import galeria.structurer_inventario.Venta;
import galeria.structurer_usuarios.Administrador;
import galeria.structurer_usuarios.Interno;

public class Controlador_Administrador {
	private Administrador administrador;
	private Galeria galeria;
	
	public Controlador_Administrador(Galeria galeria, Administrador administrador) {
		this.administrador = administrador;
		this.galeria = galeria;
	}
	public void ingresarPiezaCedida(int indice) {
		galeria.getInventarioGaleria().agregarPieza(null);
		administrador.getPiezasPorAgregar().get(indice);
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
