package structurer_usuarios;

public abstract class Internos extends Usuario {
	public final String TIPOUSUARIO = "interno";
	
	public Internos (String nombreUsuario, String contraseña, String nombre, String celular, String correo) {
		super(nombreUsuario, contraseña, nombre, celular, correo);
	}

	public String getTipoUsuario() {
		return tipoUsuario;
	}
}
