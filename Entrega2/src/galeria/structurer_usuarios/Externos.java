package structurer_usuarios;

import java.util.List;

import Comprador;
import Propietario;

public class Externos extends Usuario {
    public final String TIPOUSUARIO = "externo";
    public List<Comprador> compradores;
    public List<Propietario> propietarios;
    
    public Externos (String nombreUsuario, String contraseña, String nombre, String celular, String correo) {
		super(nombreUsuario, contraseña, nombre, celular, correo);
    }
    
    public Comprador crearComprador(String nombreUsuario, String contraseña, String nombre, String celular, String correo) {
        Comprador comprador = new Comprador(nombreUsuario, contraseña, nombre, celular, correo);
        return comprador;
    }
    
    public Propietario crearPropietario(String nombreUsuario, String contraseña, String nombre, String celular, String correo) {
        Propietario propietario = new Propietario(nombreUsuario, contraseña, nombre, celular, correo);
        return propietario;
    }
    
    public List<Comprador> getCompradores() {
        return this.compradores;
    }

    public List<Propietario> getPropietarios() {
        return this.propietarios;
    }
}
