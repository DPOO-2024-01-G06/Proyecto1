package galeria.structurer_usuarios;

import java.util.ArrayList;
import java.util.List;

import galeria.structurer_inventario.Pieza;
import galeria.structurer_inventario.Venta;

public class Administrador extends Interno {
    private List<Venta> comprasPorAceptar;
    private List<Pieza> piezasPorAgregar;
    private List<Externo> pendientesVerificar;	
	
    public Administrador(String nombreUsuario, String contraseña, String nombre, String celular, String correo,
			List<Venta> comprasPorAceptar, List<Pieza> piezasPorAgregar, List<Externo> pendientesVerificar) {
		super(nombreUsuario, contraseña, nombre, celular, correo);
		this.comprasPorAceptar = comprasPorAceptar;
		this.piezasPorAgregar = piezasPorAgregar;
		this.pendientesVerificar = pendientesVerificar;
	}
	
    public List<Venta> getComprasPorAceptar(){
        return comprasPorAceptar;
    }

    public List<Pieza> getPiezasPorAgregar() {
        return piezasPorAgregar;
    }

	@Override
	public String getTipoInterno() {
		return "administrador";
	}
}

