package com.biblioteca.controller;

import com.biblioteca.modelo.Libro;

import java.util.ArrayList;

public class LibroController {

    ArrayList<Libro> listaLibros = new ArrayList<>();

    //metodo
    public Libro crearLibro(String nombreDeLibro, String autor, String categoria, int anoDePublicacion){
        //logica para crear libro
        Libro libro = new Libro(nombreDeLibro, autor, categoria, anoDePublicacion);
        listaLibros.add(libro);

        return libro;
    }

    public ArrayList<Libro> obtenerLibros(){
        return listaLibros;
    }

    public Libro obtenerLibroPorNombre(String nombreDelLibro){
        for (Libro libroDeLaLista: listaLibros){
            if (libroDeLaLista.getNombreDeLibro().equalsIgnoreCase(nombreDelLibro)){
                return libroDeLaLista;
            }
        }
        return null;
    }
    public String eliminarLibro(String nombreDelLibroAeliminar){
        Libro libro = obtenerLibroPorNombre(nombreDelLibroAeliminar);
        if(libro != null){
            listaLibros.remove(libro);
            return "El" + libro + " a sido eliminado";
        }else {
            return " Libro no encontrado.";
        }





    }

}
