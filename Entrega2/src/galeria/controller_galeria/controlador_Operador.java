package galeria.controller_galeria;

import java.lang.reflect.Array;
import java.util.List;

import galeria.structurer_inventario.Oferta;
import galeria.structurer_inventario.Pieza;
import galeria.structurer_inventario.Subasta;
import galeria.structurer_usuarios.Interno;

public class controlador_Operador {
	private Interno interno; 

	public controlador_Operador(Interno interno){
		this.interno = interno;
	}
	
	public void agregarOferta(Subasta subasta, Oferta oferta) {
	//TODO 	
	}
	
	public void planearSubasta(Pieza pieza, double valorMinimo, double valorInicial) {
		//TODO
	}
	
	public List<Oferta> getOfertasPendientes(){
		//TODO
		return null;
	}
	
}
