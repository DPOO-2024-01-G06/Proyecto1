package galeria.controller_galeria;

import galeria.structurer_usuarios.Interno;

public class Controlador_Internos {
	private String controladorActual;
	private Contolador_Cajero controladorCajero;
	private Controlador_Administrador controladorAdministrador;
	private controlador_Operador controladorOperador;
	private Interno interno;	
	
	public Controlador_Internos(Interno interno){
		this.interno = interno;
	}
	public void decidirControlador(){
		//TODO 
	}
	public String getControladorActual() {
		return controladorActual;
	}
	public Contolador_Cajero getControladorCajero() {
		return controladorCajero;
	}
	public Controlador_Administrador getControladorAdministrador() {
		return controladorAdministrador;
	}
	public controlador_Operador getControladorOperador() {
		return controladorOperador;
	}
	public Interno getInterno() {
		return interno;
	}
	
}
