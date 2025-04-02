package org.example;

public class EstadoPromocion implements Estado{
    int precioFijado;

    public EstadoPromocion(int precioFijado){
        this.precioFijado = precioFijado;
    }
    @Override
    public int precio(int precioPropio) {
        return precioPropio - precioFijado;
    }
}
