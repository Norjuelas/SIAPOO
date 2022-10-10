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
    
    private Estudiante estudiante;
    private Profesor profesor;
    
    private String calificado;
    private String calificante;
    private String retroalimentacion;
    private int nota;

//--setter
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

    public void setRetroalimentacion(String retroalimentacion) {
        this.retroalimentacion = retroalimentacion;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }


//getter--
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

    public String getRetroalimentacion() {
        return retroalimentacion;
    }

    public int getNota() {
        return nota;
    }

}
