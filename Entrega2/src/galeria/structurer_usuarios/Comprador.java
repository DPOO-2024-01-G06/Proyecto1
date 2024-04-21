package galeria.structurer_usuarios;

import java.util.ArrayList;
import java.util.List;

import galeria.structurer_inventario.Subasta;
import galeria.structurer_inventario.Venta;

public class Comprador {
	public float valorMaximo;
	public boolean verificado;
	public float salario;
	public List<Venta> compras;
	public List<Subasta> subastasGanadas;
	
	public Comprador() {
		this.valorMaximo = 0;
        this.verificado = false;
        this.salario = 0;
        this.compras = new ArrayList<>();
        this.subastasGanadas = new ArrayList<>();
	}
	
	
	public void setValorMaximo(float valorMaximo) {
        this.valorMaximo = valorMaximo;
    }

	public void setVerificado(boolean verificado) {
	    this.verificado = verificado;
	}

	public float getSalario() {
		return salario;
	}

    public void getCompras() {
    }

	public void getSubastasGanadas() {
    }

    public void agregarSubasta(Subasta subasta) {
        this.subastasGanadas.add(subasta);
    }

	public void agregarCompras(Venta venta) {
		this.compras.add(venta);
	}

		
}
