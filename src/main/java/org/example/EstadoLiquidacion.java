package org.example;

public class EstadoLiquidacion implements Estado{
    int porcentajeDescuento;

    public EstadoLiquidacion(int porcentajeDescuento){
        this.porcentajeDescuento = porcentajeDescuento;
    }
    @Override
    public int precio(int precioPropio) {
        return precioPropio * (porcentajeDescuento/100);
    }
}
