package com.generation.pruebajava1.models;

public class Alumno extends Persona {
    public Double notas;
    public Boolean antiguo;
    public String materiaCursada;
    public String curso;
    public Object setnombre;

    public Alumno() {
        super();
    }

    
    public Alumno(String nombre, String apellido, Integer rut, Integer edad, Double notas, Boolean antiguo,
            String materiaCursada, String curso) {
        super(nombre, apellido, rut, edad);
        this.notas = notas;
        this.antiguo = antiguo;
        this.materiaCursada = materiaCursada;
        this.curso = curso;
    }


    public Double getNotas() {
        return notas;
    }


    public void setNotas(Double notas) {
        this.notas = notas;
    }


    public Boolean getAntiguo() {
        return antiguo;
    }


    public void setAntiguo(Boolean antiguo) {
        this.antiguo = antiguo;
    }


    public String getMateriaCursada() {
        return materiaCursada;
    }


    public void setMateriaCursada(String materiaCursada) {
        this.materiaCursada = materiaCursada;
    }


    public String getCurso() {
        return curso;
    }


    public void setCurso(String curso) {
        this.curso = curso;
    }


    @Override
    public String toString() {
        return super.toString() + "Alumno [notas=" + notas + ", antiguo=" + antiguo + ", materiaCursada=" + materiaCursada + ", curso="
                + curso + "]";
    }

    
    

    
    

    
    
    



    
}
