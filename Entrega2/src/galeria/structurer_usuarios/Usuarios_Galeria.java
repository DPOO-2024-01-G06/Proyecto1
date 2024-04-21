package structurer_usuarios;

import java.util.ArrayList;
import java.util.List;

import Administrador;
import Operador;
import Externos;
import Cajero;

public class Usuarios_Galeria {
    private Administrador administrador;
    private Cajero cajero;
    private Operador operador;
    private List<Externos> externos;

    public Usuarios_Galeria() {
        this.administrador = Administrador.Administrador (nombreUsuario, contraseña, nombre, celular, correo);
        this.cajero = Cajero.Cajero (nombreUsuario, contraseña, nombre, celular, correo);
        this.operador = Operador.Operador (nombreUsuario, contraseña, nombre, celular, correo);
        this.externos = new ArrayList<>();
    }

    public void agregarExterno(Externos usuario) {
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

    public Administrador setAdministrador (Administrador administrador) {
        this.Administrador = administrador;
    }

    public Cajero setCajero (Cajero cajero) {
        this.Cajero = cajero;
    }

    public Operador setOperador (Operador operador)
        this.Operador = operador;
}
