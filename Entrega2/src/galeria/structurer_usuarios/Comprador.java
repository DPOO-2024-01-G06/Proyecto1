package structurer_usuarios;

import java.util.ArrayList;
import java.util.List;

import Externos;
import structurer_inventario.Venta;
import structurer_inventario.Subasta;

public class Comprador {
	public float valorMaximo = 0;
	public boolean verificado = false;
	public float salario = 0;
	public list<venta> compras;
	public list<subasta> subastasGanadas;
	
	public Comprador(String nombreUsuario, String contraseña, String nombre, String celular, String correo) {
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
        return this.compras;
    }

	public void getSubastasGanadas() {
        return this.subastasGanadas;
    }

    public void agregarSubasta(Subasta subasta) {
        this.subastasGanadas.add(subasta);
    }

	public void agragarCompras(Venta venta) {
		this.compras.add(venta);
	}

		
}
