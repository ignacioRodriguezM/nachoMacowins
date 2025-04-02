package org.example;

import java.util.List;

public class Efectivo implements Medio{
    @Override
    public int precioFinal(int cuotas, List<Prenda> prendasVendidas, int cantidad, int precioBase) {
        return precioBase;
    }
}
