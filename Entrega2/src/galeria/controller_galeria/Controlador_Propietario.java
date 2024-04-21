package galeria.controller_galeria;

import galeria.Galeria;
import galeria.structurer_usuarios.Externo;

public class Controlador_Propietario {
	private Externo externo;
	private Galeria galeria;
	
	Controlador_Propietario(Galeria galeria, Externo externo){
		this.externo = externo;
		this.galeria = galeria;
	}

}
