package galeria.structurer_inventario;
public class Impresion extends Pieza {
	private double alto;
	private double ancho;
	private String tipoPapel;
	
	public Impresion(String titulo, int anio, String lugarCreacion, boolean electricidad, String tiempoDisponible,
		String autor, double alto, double ancho, String tipoPapel) {
		super(titulo, anio, lugarCreacion, electricidad, tiempoDisponible, autor);
		this.alto = alto;
		this.ancho = ancho;
		this.tipoPapel= tipoPapel;
	}
	
}
