package galeria.controller_galeria;

public class Coordinador_Sesion {
	private String usuario;
	private String contrasena;
	private Controlador_Internos controladorInternos;
	private Controlador_Externos controladorExternos;
	
		
	public Coordinador_Sesion(){ 
		controladorInternos = new Controlador_Internos();
		controladorExternos = new Controlador_Externos();
	}
	public void iniciarSesion(String usuarioEntregado, String contrasenaEntregada) {
		this.usuario = usuarioEntregado;
		this.contrasena = contrasenaEntregada;
	}	
}
