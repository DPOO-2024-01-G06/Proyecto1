package Internos;

import Usuarios.Internos;
import java.util.List;

public class Cajero extends Internos {
	public static String tipoInterno = "cajero";
	public list<venta> ventasRealizadas;
	
	public Cajero (String nombreUsuario, String contraseña, String nombre, String celular, String correo) {
        super(nombreUsuario, contraseña, nombre, celular, correo);
	}
	
	public void registrarPago(Venta venta) {
        this.ventasRealizadas.add(venta);
    }
}
