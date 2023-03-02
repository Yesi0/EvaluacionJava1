package com.generation.pruebajava1.models;

public class Profesor extends Persona{
    public String materiaImpartida;
    public String cursoImpartido;


    public Profesor() {
        super();
    }


    public Profesor(String nombre, String apellido, Integer rut, Integer edad, String materiaImpartida,
            String cursoImpartido) {
        super(nombre, apellido, rut, edad);
        this.materiaImpartida = materiaImpartida;
        this.cursoImpartido = cursoImpartido;
    }


    public String getMateriaImpartida() {
        return materiaImpartida;
    }


    public void setMateriaImpartida(String materiaImpartida) {
        this.materiaImpartida = materiaImpartida;
    }


    public String getCursoImpartido() {
        return cursoImpartido;
    }


    public void setCursoImpartido(String cursoImpartido) {
        this.cursoImpartido = cursoImpartido;
    }


    @Override
    public String toString() {
        return  super.toString() + "Profesor [materiaImpartida=" + materiaImpartida + ", cursoImpartido=" + cursoImpartido + "]";
    }

    


   
    

    
    

    
    
}
