package galeria.structurer_inventario;

public class Oferta {
	//private externo: externo;
	private double valor;
	private String metodoPago;
	
	public Oferta(double valor, String metodoPago) {
		super();
		this.valor = valor;
		this.metodoPago = metodoPago;
	}

	public double getValor() {
		return valor;
	}

	public String getMetodoPago() {
		return metodoPago;
	}
 
}
