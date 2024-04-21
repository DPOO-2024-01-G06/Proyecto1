package Externos;

import java.util.ArrayList;
import java.util.List;

import Usuarios.Externos;
// importar la clase de ventas y de subastas

public class Comprador {
	public Externos externo;
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
	
	
	public void setVerificado(boolean verificado) {
	    this.verificado = verificado;
	}
	
	public void setValorMaximo(float valorMaximo) {
        this.valorMaximo = valorMaximo;
    }

    public void agregarCompra(Venta venta) {
        this.compras.add(venta);
    }

    public void agregarSubasta(Subasta subasta) {
        this.subastasGanadas.add(subasta);
    }
		
}
