package structurer_usuarios;

public abstract class Usuario {
	protected String nombreUsuario;
    protected String contraseña;
    protected String nombre;
    protected String celular;
    protected String correo;
    
    
    public Usuario (String nombreUsuario, String contraseña, String nombre, String celular, String correo) {
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.celular = celular;
        this.correo = correo;
    }
    
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getCelular() {
        return celular;
    }

    public String getCorreo() {
        return correo;
    }

    
}
