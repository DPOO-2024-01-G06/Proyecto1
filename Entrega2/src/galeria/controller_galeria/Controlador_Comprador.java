package galeria.controller_galeria;

import galeria.Galeria;
import galeria.structurer_usuarios.Externo;

public class Controlador_Comprador {
	private Galeria galeria;
	private Externo externo;

	Controlador_Comprador(Galeria galeria, Externo externo){
		this.galeria = galeria; 
		this.externo = externo;
	}
}
