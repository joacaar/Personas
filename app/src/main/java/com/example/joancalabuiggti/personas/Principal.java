/*
    Autor: Joan calabuig artes
    Fecha: 17/09/18
    Descripción: Programa que almacena una lista de personas con ciertos datos y sus
                 numeros de telefono.
     TODO:
 */

package com.example.joancalabuiggti.personas;

import java.util.ArrayList;

public class Principal {

    public static void main(String args[]) {

//        Inicializamos el array que almacenara a los objetos Persona
        ArrayList<Persona> personas = new ArrayList<Persona>();


//        --Creamos un objeto de tipo Persona y lo añadimos al array
//        Persona yo = new Persona(123456789, "Joan", "Calabuig");
//        personas.add(yo);
        personas.add(new Persona(123456789, "Joan", "Calabuig"));


//      -- AL objeto de tipo Persona creado antes, le añadimos dos objetos de tipo Telefono
        //yo.anyadir(new Telefono("Movil", 456789132);
        personas.get(0).anyadir(new Telefono("Movil", 456789132));
        personas.get(0).anyadir(new Telefono("Trabajo", 789456123));

//      --Buscamos en el array de personas a la persona cone el nombre pasado por parametro
//        y devolvemos el resultado de tipo Persona
        Persona p = buscar(personas, "Joan");

//      -- Hace que se muestren por pantalla los telefonos de la Perona -p-
        p.mostrarTelefonos();
        p.mostrarInformacion();
        p.quitar(456789132, "Movil");
        p.mostrarInformacion();
    }

//  -- Funcion estatica que busca a una persona dentro de un array de tipo Persona
    public static Persona buscar (ArrayList<Persona> personas, String nombre){

        for(int i = 0; i< personas.size(); i++){
            if(personas.get(i).getNombre() == nombre){
                return personas.get(i);
            }
        }

        return null;
    }
}
