package Internos;

import Usuarios.Internos;

public class Operador extends Internos {
	public static String tipoInterno = "operador";
	
	public Operador(String nombreUsuario, String contraseña, String nombre, String celular, String correo) {
        super(nombreUsuario, contraseña, nombre, celular, correo);
	}
}
