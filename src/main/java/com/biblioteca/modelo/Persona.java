package com.biblioteca.modelo;

public class Persona {
    private String nombre;
    private String direccion;
    private int telefono;


//constructor
    public Persona(String nombre, String direccion, int telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    //Métodos

    public String getNombre() {
        return this.nombre;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public int getTelefono() {
        return this.telefono;
    }

    public void setTelefono(int telefonoParametro) {
        this.telefono = telefonoParametro;
    }

    public void setNombre(String nombreParametro) {
        this.nombre = nombreParametro;

    }

    public void setDireccion(String direccionParametro) {
        this.direccion = direccionParametro;
    }

    @Override
    public String toString() {
        return "com.biblioteca.modelo.Persona{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono=" + telefono +
                '}';
    }
}