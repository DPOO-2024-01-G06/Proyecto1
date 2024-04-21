package galeria.structurer_usuarios;

import java.util.ArrayList;
import java.util.List;

import galeria.structurer_inventario.Subasta;


public class Operador extends Interno {
	private List<Subasta> subastasPendientes;
	
	public Operador(String nombreUsuario, String contraseña, String nombre, String celular, String correo) {
        super(nombreUsuario, contraseña, nombre, celular, correo);
		this.subastasPendientes = new ArrayList<>();
	}

	public void agregarSubasta (Subasta subasta){
		this.subastasPendientes.add(subasta);
	}

	@Override
	public String getTipoInterno() {
		return "operador";
	}
	
}
