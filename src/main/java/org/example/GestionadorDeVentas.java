package org.example;
import java.time.LocalDate;
import java.util.List;

public class GestionadorDeVentas {
    List<Venta> ventasTotales;

    public void agregarVenta(Venta nuevaVenta) {
        ventasTotales.add(nuevaVenta);
    }
    public List<Venta> ventasDelDia(LocalDate fecha) {
        return ventasTotales.stream().filter(venta -> venta.fechaVenta == fecha).toList();
    }
}
