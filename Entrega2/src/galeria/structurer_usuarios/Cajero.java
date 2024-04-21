package structurer_usuarios;

import java.util.ArrayList;
import java.util.List;

import Internos;
import Usuarios_Galeria;
import structurer_inventario.Venta;

import java.util.List;

public class Cajero extends Internos {
	public final String TIPOINTERNO = "cajero";
	public list<venta> ventasPendientes;
	
	public Cajero (String nombreUsuario, String contraseña, String nombre, String celular, String correo) {
        super(nombreUsuario, contraseña, nombre, celular, correo);
		this.ventasPendientes = new ArrayList<>();
	}
	
	public void registrarPago(Venta venta) {
        this.ventasRealizadas.add(venta);
    }

	public void agregarVenta(Venta venta) {
		this.ventasPendientes.add(venta);
	}
}
