package galeria.controller_galeria;

import galeria.Galeria;
import galeria.structurer_inventario.Venta;
import galeria.structurer_usuarios.Cajero;

public class Coordinador_Usuarios {
	
	private Galeria galeria;
	Coordinador_Usuarios(Galeria galeria){
		this.galeria = galeria;
	}
	public void aceptarVenta(Venta venta) {
		Cajero cajero = galeria.getUsuariosGaleria().getCajero();
		cajero.getVentasPendientes().add(venta);
	}
	

}
