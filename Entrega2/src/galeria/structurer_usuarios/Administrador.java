package Internos;

import Usuarios.Internos;
import Externos.Comprador;
import Externos.Propietario;
//importar clase de piezas

public class Administrador extends Internos {
	public static String tipoInterno = "administrador";
	
	public Administrador(String nombreUsuario, String contraseña, String nombre, String celular, String correo) {
        super(nombreUsuario, contraseña, nombre, celular, correo);
    }
	
	public void verificarComprador(Comprador comprador) {
		comprador.setVerificado(true);
	}
	
	public void cambiarValorMaximo(Comprador comprador, float nuevoValorMaximo) {
	    comprador.setValorMaximo(nuevoValorMaximo);
	}
	
	public void devolverPieza(Pieza pieza, Propietario propietario) {
        // agregar quitar la pieza de la lista de la galeria
        propietario.getPiezasPropiedad().add(pieza);
        propietario.getPiezasCedidas().remove(pieza);
    }
	
	public void registrarPieza(Pieza pieza, Propietario propietario) {
		//agragar pieza a la lista de piezas de la galeria
	}
}

