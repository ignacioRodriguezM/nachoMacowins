package org.example;

public class Prenda {

    private int precioPropio;
    private Estado estado;
    private TiposPrendas tipo;

    public Prenda(int precioPropio, Estado estado, TiposPrendas tipo){
        this.precioPropio = precioPropio;
        this.estado = estado;
        this.tipo = tipo;
    }

    public int precio() {
        return estado.precio(precioPropio);
    }
}