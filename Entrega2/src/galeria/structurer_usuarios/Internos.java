package Usuarios;

public abstract class Internos extends Usuario {
	public static String tipoUsuario = "interno";
	
	public Internos (String nombreUsuario, String contraseña, String nombre, String celular, String correo) {
		super(nombreUsuario, contraseña, nombre, celular, correo);
	}

	public String getTipoUsuario() {
		return tipoUsuario;
	}
}
