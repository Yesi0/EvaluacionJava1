package com.generation.pruebajava1.models;

public class Persona {
    public String nombre;
    public String apellido;
    public Integer rut;     
    public Integer edad;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer rut, Integer edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getRut() {
        return rut;
    }

    public void setRut(Integer rut) {
        this.rut = rut;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }


    

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", rut=" + rut + ", edad=" + edad + "]";
    }

    
    
    
    }

    

    

    

