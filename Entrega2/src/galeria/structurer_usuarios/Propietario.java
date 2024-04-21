package galeria.structurer_usuarios;

import java.util.ArrayList;
import java.util.List;

import galeria.structurer_inventario.Pieza;


public class Propietario {
	public List<Pieza> piezasPropiedad;
	public List<Pieza> piezasCedidas;
	
	public Propietario() {
        this.piezasPropiedad = new ArrayList<>();
        this.piezasCedidas = new ArrayList<>();
    }

    public List<Pieza> getPiezasPropiedad() {
        return piezasPropiedad;
    }

    public List<Pieza> getPiezasCedidas() {
        return piezasCedidas;
    }
	

}
