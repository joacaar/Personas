package com.example.joancalabuiggti.personas;

public class Telefono {

    private int numero;
    private String descripcion;

    public Telefono (String descripcion, int numero){
        this.descripcion = descripcion;
        this.numero = numero;
    }

//    Métodos Getters y Setters

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
