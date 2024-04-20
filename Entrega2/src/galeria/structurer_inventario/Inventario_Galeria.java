package Inventario;
import java.util.HashMap;
import java.util.Map;

public class Inventario_Galeria {
    private Map<String, Subasta> subastasPendientes = new HashMap<>();
    private Map<String, Subasta> subastasPasadas = new HashMap<>();
    private Map<String, Venta> ventasPendientes = new HashMap<>();
    private Map<String, Venta> ventasAceptadas = new HashMap<>();
    private Map<String, Pieza> inventario = new HashMap<>();

    //ventas
    //se debe crear la venta antes de ingresar
    // ej el admin agrega la pieza y luego le pregunta los datos de venta
    public void agregarPieza(Venta venta) {
        ventasPendientes.put(venta.getPieza().getTitulo(), venta);
        inventario.put(venta.getPieza().getTitulo(), venta.getPieza());
    }

    //el primer intento de un cliente de comprar la pieza
    public void intentoVender(Venta venta) {
        Pieza pieza = inventario.get(venta.getPieza().getTitulo());
        pieza.setBloqueado(true);
    }

    //el cliente cumple los requisitos para venderla
    public void venderPieza(Venta venta){
        venta.setAceptada(true);
    }

    //la facturacion es exitosa
    public void facturada(Venta venta){
        venta.setFacturada(true);
        ventasPendientes.remove(venta.getPieza().getTitulo());
        ventasAceptadas.put(venta.getPieza().getTitulo(), venta);
    }

    //subastas
    public void agregarSubasta(Subasta subasta, Venta venta) {
        ventasPendientes.remove(venta.getPieza().getTitulo());
        subastasPendientes.put(subasta.getPieza().getTitulo(), subasta);
    }

    public void moverSubastaAPasadas(Subasta subasta) {
        if(Subasta.verificarTiempo(subasta)){
            subastasPendientes.remove(subasta.getPieza().getTitulo());
            subastasPasadas.put(subasta.getPieza().getTitulo(), subasta);
            Pieza pieza = inventario.get(subasta.getPieza().getTitulo());
            pieza.setBloqueado(false);
        }
    }
    Inventario_Galeria inventario_Galeria = new Inventario_Galeria();
}


