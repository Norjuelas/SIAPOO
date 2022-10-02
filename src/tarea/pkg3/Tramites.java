/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.pkg3;

/**
 *
 * @author Jeison Diaz y Nicolas Orjuela
 */
public class Tramites{
    
    Profesor profesor;
    Estudiante estudiante;
    
    public String tramite_realizar;
    public String solicitante;
    public int fecha_solicitud;

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public void setTramite_realizar(String tramite_realizar) {
        this.tramite_realizar = tramite_realizar;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    public void setFecha_solicitud(int fecha_solicitud) {
        this.fecha_solicitud = fecha_solicitud;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public String getTramite_realizar() {
        return tramite_realizar;
    }

    public String getSolicitante() {
        return solicitante;
    }

    public int getFecha_solicitud() {
        return fecha_solicitud;
    }

    
    
    
    
}
