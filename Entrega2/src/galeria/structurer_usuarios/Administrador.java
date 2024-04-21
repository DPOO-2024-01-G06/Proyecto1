package structurer_usuarios;

import java.util.ArrayList;
import java.util.List;

import Externos;
import Usuarios_Galeria;
import structurer_inventario.Venta;
import structurer_inventario.Pieza;

public class Administrador extends Internos {
	public final String TIPOINTERNO = "administrador";
    public list<venta> comprasPorAceptar;
    public list<pieza> piezasPorAgregar
	
	public Administrador(String nombreUsuario, String contraseña, String nombre, String celular, String correo) {
        super(nombreUsuario, contraseña, nombre, celular, correo);
        this.comprasPorAceptar = new ArrayList<>();
        this.piezasPorAgregar = new ArrayList<>();
    }

    public void agragarExterno (Externo externo){
        usuariosGaleria.agregarExterno(externo);
    }
	
    public list<venta> getComprasPorAceptar(){
        return comprasPorAceptar;
    }

    public list<pieza> getPiezasPorAgregar() {
        return piezasPorAgregar
    }
}

