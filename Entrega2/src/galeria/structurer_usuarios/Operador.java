package structurer_usuarios;

import java.util.ArrayList;
import java.util.List;

import Internos;
import structurer_inventario.Subasta;

public class Operador extends Internos {
	public final String TIPOINTERNO = "operador";
	public list<subasta> subastasPendientes;
	
	public Operador(String nombreUsuario, String contraseña, String nombre, String celular, String correo) {
        super(nombreUsuario, contraseña, nombre, celular, correo);
		this.subastasPendientes = new ArrayList<>();
	}

	public void agregarSubasta (Subasta subasta){
		this.subastasPendientes.add(subasta);
	}
	
}
