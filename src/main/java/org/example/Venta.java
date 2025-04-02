package org.example;

import java.time.LocalDate;
import java.util.List;

public class Venta {
    List<Prenda> prendasVendidas;
    int cantidad = prendasVendidas.size();
    LocalDate fechaVenta;
    Medio medioDePago;
    int cuotas;
    private int precioBase() {
        return prendasVendidas.stream().mapToInt(Prenda::precio).sum();
    }
    public Venta(List<Prenda> prendasVendidas, int cantidad, LocalDate fechaVenta, Medio medioDePago, int cuotas){
        this.prendasVendidas = prendasVendidas;
        this.cantidad = cantidad;
        this.fechaVenta = fechaVenta;
        this.medioDePago = medioDePago;
        this.cuotas = cuotas;

    }
    public int valor() {
        return medioDePago.precioFinal(this.cuotas, this.prendasVendidas, this.cantidad, this.precioBase());
    }
}
