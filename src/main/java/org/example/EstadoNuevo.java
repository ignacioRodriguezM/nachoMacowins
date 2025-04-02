package org.example;

public class EstadoNuevo implements Estado{

    @Override
    public int precio(int precioPropio) {
        return precioPropio;
    }
}
