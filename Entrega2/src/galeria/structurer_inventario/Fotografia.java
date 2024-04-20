package Inventario;

public class Fotografia extends Pieza{
    private double ancho;
    private double alto;
    private String tipoPapel;

    public Fotografia(String titulo, int anio, String lugarCreacion, boolean electricidad,
            String tiempoDisponible, String autor, double ancho, double alto, String tipoPapel) {
        super(titulo, anio, lugarCreacion, electricidad, tiempoDisponible, autor);
        this.ancho = ancho;
        this.alto = alto;
        this.tipoPapel = tipoPapel;
    }
}