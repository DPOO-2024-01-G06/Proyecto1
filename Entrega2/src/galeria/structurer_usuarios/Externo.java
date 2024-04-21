package galeria.structurer_usuarios;

import java.util.List;


public class Externo extends Usuario {
    private List<Comprador> compradores;
    private List<Propietario> propietarios;
    
    public Externo (String nombreUsuario, String contraseña, String nombre, String celular, String correo) {
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

	@Override
	public String getTipoUsuario() {
		return "externo";
	}
}
