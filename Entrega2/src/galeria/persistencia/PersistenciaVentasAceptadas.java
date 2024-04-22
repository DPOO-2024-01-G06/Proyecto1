package persistencia;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import galeria.structurer_inventario.Venta;

public class PersistenciaVentasAceptadas extends PersistenciaCentral<Map<Integer, Venta>> {
    private static final String ARCHIVO_VENTAS_ACEPTADAS = "ventas_aceptadas.dat";

    @Override
    public void guardar(Map<Integer, Venta> ventasAceptadas) {
        super.guardar(ventasAceptadas);
    }

    @Override
    public Map<Integer, Venta> cargar() {
        return super.cargar();
    }
}
