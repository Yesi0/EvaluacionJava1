package com.generation.pruebajava1.models;

public class Curso {
    public String nombre;

    public Curso() {
    }

    public Curso(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Curso [nombre=" + nombre + "]";
    }

    
    
    
    

    
}
