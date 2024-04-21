package galeria.controller_galeria;

import java.util.List;
import java.util.Map;

import galeria.Galeria;
import galeria.structurer_inventario.Pieza;
import galeria.structurer_inventario.Venta;
import galeria.structurer_usuarios.Administrador;
import galeria.structurer_usuarios.Externo;

public class Controlador_Administrador {
	private Administrador administrador;
	private Galeria galeria;
	private Coordinador_Usuarios coordinadorUsuarios;
	
	public Controlador_Administrador(Galeria galeria, Administrador administrador) {
		this.administrador = administrador;
		this.galeria = galeria;
		coordinadorUsuarios = new Coordinador_Usuarios(galeria);
	}
	public void ingresarPiezaCedida(int indice, double precio) {
		Pieza pieza = administrador.getPiezasPorAgregar().get(indice);
		Venta venta = new Venta(precio, false, false, pieza);
		galeria.getInventarioGaleria().agregarPieza(venta);
	}
	public Map<Integer, Pieza> getInventario(){
		return galeria.getInventarioGaleria().getInventario();
	}
	public List<Venta> getVentasPendientes(){
		return administrador.getPendientesAceptar();
	}
	public List<Externo> getUsuariosPendientes(){
		return administrador.getPendientesVerificar();
	}
	public void aceptarVenta(int indice) {
		Venta venta = administrador.getPendientesAceptar().get(indice);
		administrador.getPendientesAceptar().remove(indice);
		venta.setAceptada(true);
		coordinadorUsuarios.aceptarVenta(venta);
	}
	
	public void verificarExterno(int indice) {
		Externo externo = administrador.getPendientesVerificar().get(indice);
		externo
	}
	

}
