package org.example;

import java.util.List;

public interface Medio {
    int precioFinal(int cuotas, List<Prenda> prendasVendidas, int cantidad, int precioBase);
}
