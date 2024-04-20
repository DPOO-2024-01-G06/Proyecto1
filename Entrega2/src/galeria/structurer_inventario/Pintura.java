package galeria.structurer_inventario;

public class Pintura extends Pieza {
	private double ancho;
	private double alto;
	private String tipoLienzo;
	
	public Pintura(String titulo, int anio, String lugarCreacion, boolean electricidad, String tiempoDisponible,
			String autor, double ancho, double alto, String tipoLienzo) {
		super(titulo, anio, lugarCreacion, electricidad, tiempoDisponible, autor);
		this.ancho = ancho;
		this.alto = alto;
		this.tipoLienzo = tipoLienzo;
	}

}
