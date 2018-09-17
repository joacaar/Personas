package com.example.joancalabuiggti.personas;

import java.util.ArrayList;

public class Persona {

    private String nombre;
    private String apellido;
    private int dni;
    private String genero;
    private String nacionalidad;
    private ArrayList <Telefono> telefonos = new ArrayList();

    public Persona(int dni, String nombre, String apellido){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void anyadir(Telefono telf){
        this.telefonos.add(telf);
    }

    public void mostrarTelefonos(){
        for (int i= 0; i < this.telefonos.size(); i++){
            System.out.println(this.telefonos.get(i).getNumero());
        }
    }

//    Metodos Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Telefono> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(ArrayList<Telefono> telefonos) {
        this.telefonos = telefonos;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

}