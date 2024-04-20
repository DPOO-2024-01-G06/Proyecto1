package Inventario;

public class Escultura extends Pieza{
	private double alto;
	private double ancho;
	private double profundidad;
	private double peso;
	private String material;
	private String instalacion;
	
	public Escultura(String titulo, int anio, String lugarCreacion, boolean electricidad, String tiempoDisponible,
			String autor, double alto, double ancho, double profundidad, double peso, String material,
			String instalacion) {
		super(titulo, anio, lugarCreacion, electricidad, tiempoDisponible, autor);
		this.alto = alto;
		this.ancho = ancho;
		this.profundidad = profundidad;
		this.peso = peso;
		this.material = material;
		this.instalacion = instalacion;
	}
	
	
}
