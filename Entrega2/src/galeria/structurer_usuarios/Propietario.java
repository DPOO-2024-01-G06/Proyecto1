package Externos;

import java.util.ArrayList;

import Usuarios.Externos;
//importar la clase de piezas

public class Propietario {
	public list<pieza> piezasPropiedad;
	public list<pieza> piezasCedidas;
	
	public Propietario(String nombreUsuario, String contraseña, String nombre, String celular, String correo) {
        this.piezasPropiedad = new ArrayList<>();
        this.piezasCedidas = new ArrayList<>();
    }

    public List<Pieza> getPiezasPropiedad() {
        return piezasPropiedad;
    }

    public List<Pieza> getPiezasCedidas() {
        return piezasCedidas;
    }
	

}