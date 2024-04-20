package Inventario;

public class Video extends Pieza {
	private double duracion;
	private String formato;
	private String recursosNecesarios;
	public Video(String titulo, int anio, String lugarCreacion, boolean electricidad, String tiempoDisponible,
			String autor, double duracion, String formato, String recursosNecesarios) {
		super(titulo, anio, lugarCreacion, electricidad, tiempoDisponible, autor);
		this.duracion = duracion;
		this.formato = formato;
		this.recursosNecesarios = recursosNecesarios;
	}
	
	
	
}
