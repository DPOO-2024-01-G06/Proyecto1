package galeria.structurer_usuarios;

import java.util.List;


public class Externo extends Usuario {
    private Comprador comprador;
    private Propietario propietario;
    
    public Externo (String nombreUsuario, String contraseña, String nombre, String celular, String correo, Comprador comprador, Propietario propietario) {
		super(nombreUsuario, contraseña, nombre, celular, correo);
		this.propietario = propietario;
		this.comprador = comprador;
    }
    
    public Comprador crearComprador(String nombreUsuario, String contraseña, String nombre, String celular, String correo) {
        Comprador comprador = new Comprador();
        return comprador;
    }
    
    public Propietario crearPropietario(String nombreUsuario, String contraseña, String nombre, String celular, String correo) {
        Propietario propietario = new Propietario();
        return propietario;
    }
    
    public Comprador getCompradores() {
        return comprador;
    }

    public Propietario getPropietarios() {
        return propietario;
    }

	@Override
	public String getTipoUsuario() {
		return "externo";
	}
}
