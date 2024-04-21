package galeria.controller_galeria;

import java.lang.reflect.Array;
import java.util.List;

import galeria.Galeria;
import galeria.structurer_inventario.Oferta;
import galeria.structurer_inventario.Pieza;
import galeria.structurer_inventario.Subasta;
import galeria.structurer_usuarios.Interno;
import galeria.structurer_usuarios.Operador;

public class Controlador_Operador {
	private Operador operador; 
	private Galeria galeria;

	public Controlador_Operador(Galeria galeria, Operador operador){
		this.operador = operador;
		this.galeria = galeria;
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
