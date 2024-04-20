package galeria.controller_galeria;

import galeria.Galeria;
import galeria.structurer_usuarios.Usuario;

public class Coordinador_Sesion {
	private String nombreUsuario;
	private String contrasena;
	private Controlador_Internos controladorInternos;
	private Controlador_Externos controladorExternos;
	private Usuario usuario;
	private Galeria galeria;
	
	
	public Coordinador_Sesion() {
	}
	public void iniciarSesion(String nombreUsuario, String contrasenaEntregada) {
		this.nombreUsuario = nombreUsuario;
		this.contrasena = contrasenaEntregada;
		
	}
	public void crearNuevoExterno(String usuario, String contrasena) {
		//TODO
	}
	
	
	
}
