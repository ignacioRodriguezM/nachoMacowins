package org.example;

import java.util.List;

public class Tarjeta implements Medio{
    int coeficienteFijo;
    public Tarjeta(int coeficienteFijo) {
        this.coeficienteFijo = coeficienteFijo;
    }

    public int precioFinal(int cuotas, List<Prenda> prendasVendidas, int cantidad, int precioBase) {
        return (int) (precioBase + (cuotas * coeficienteFijo + 0.01 * precioBase));
    }
}