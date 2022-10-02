/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.pkg3;

/**
 *
 * @author Jeison Diaz y Nicolas Orjuela
 */

public class Calificacion {
    
    Estudiante estudiante;
    Profesor profesor;
    
    public String calificado;
    public String calificante;
    private int nota;
    public String retroalimentacion;

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public void setCalificado(String calificado) {
        this.calificado = calificado;
    }

    public void setCalificante(String calificante) {
        this.calificante = calificante;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public void setRetroalimentacion(String retroalimentacion) {
        this.retroalimentacion = retroalimentacion;
    }

    
    
    public Estudiante getEstudiante() {
        return estudiante;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public String getCalificado() {
        return calificado;
    }

    public String getCalificante() {
        return calificante;
    }

    public int getNota() {
        return nota;
    }

    public String getRetroalimentacion() {
        return retroalimentacion;
    }
    
    
    
}
