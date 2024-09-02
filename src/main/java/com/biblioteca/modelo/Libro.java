package com.biblioteca.modelo;

public class Libro {
    private String nombreDeLibro;
    private String autor;
    private int anoDePublicacion;
    private String categoria;
    private int contador;

    //constructor


    public Libro(String nombreDeLibro, String autor, String categoria, int anoDePublicacion) {
        this.nombreDeLibro = nombreDeLibro;
        this.autor = autor;
        this.categoria = categoria;
        this.anoDePublicacion = anoDePublicacion;
    }

    //Métodos
    public String getNombreDeLibro(){
        return nombreDeLibro;
    }

    public String getAutor(){
        return autor;
    }

    @Override
    public String toString() {
        return
                "nombreDeLibro = " + nombreDeLibro +
                ", autor =" + autor +
                ", categoria = " + categoria+
                        ", año de publicacion = " + anoDePublicacion;

    }

    public void reNombrar(String nuevoNombreAutor){
        if ( contador < 2){
            contador++;
            autor = nuevoNombreAutor;

        }else{
            System.out.println("Sólo se puede cambiar dos veces el nombre.");
        }
    }
    public void modificarFecha(int fechaNuevaDelLibro){
        if (fechaNuevaDelLibro <= 2024){
            anoDePublicacion = fechaNuevaDelLibro;
            System.out.println("se cambio satisfactoriamente la fecha.");
        }else{
            System.out.println("Esta fecha no es correcta.");
        }

    }


}
