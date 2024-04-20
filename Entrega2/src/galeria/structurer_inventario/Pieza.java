package galeria.structurer_inventario;

public class Pieza {
	protected String titulo;
	protected int anio;
	protected String lugarCreacion;
	protected boolean electricidad;
	protected boolean exhibicion;
	protected String tiempoDisponible;
	protected boolean bloqueado;
	protected String autor;
	//private externo externo;

	public Pieza(String titulo, int anio, String lugarCreacion, boolean electricidad,String tiempoDisponible, String autor) {
		this.titulo =titulo;
		this.anio= anio;
		this.lugarCreacion=lugarCreacion;
		this.electricidad = electricidad;
		this.exhibicion = true;
		this.tiempoDisponible = tiempoDisponible;
		this.bloqueado = false;
		this.autor = autor;
	}
		public void setExhibicion(boolean exhibicion) {
			this.exhibicion = exhibicion;
		}
		public void setBloqueado(boolean bloqueado) {
			this.bloqueado = bloqueado;
		}
	
		public String getTitulo() {
			return titulo;
		}
		public boolean isExhibicion() {
			return exhibicion;
		}
		public String getTiempoDisponible() {
			return tiempoDisponible;
		}
		public boolean isBloqueado() {
			return bloqueado;
		}
}
