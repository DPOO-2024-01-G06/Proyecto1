package Galería;

import java.util.ArrayList;
import java.util.List;

import Internos.Administrador;
import Internos.Operador;
import Usuarios.Externos;
import Internos.Cajero;
import Externos.Comprador;
import Externos.Propietario;

public class UsuariosGaleria {
    private Administrador administrador;
    private Cajero cajero;
    private Operador operador;
    private List<Externos> externos;

    public UsuariosGaleria() {
        this.administrador = Administrador.Administrador (nombreUsuario, contraseña, nombre, celular, correo);
        this.cajero = Cajero.Cajero (nombreUsuario, contraseña, nombre, celular, correo);
        this.operador = Operador.Operador (nombreUsuario, contraseña, nombre, celular, correo);
        this.externos = new ArrayList<>();
    }

    public void addExterno(Externos usuario) {
        this.externos.add(usuario);
    }

    public List<Externos> getExternos() {
        return externos;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public Cajero getCajero() {
        return cajero;
    }

    public Operador getOperador() {
        return operador;
    }
}
