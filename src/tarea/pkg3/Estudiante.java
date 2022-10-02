/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.pkg3;

/**
 *
 * @author Jeison Diaz y Nicolas Orjuela 
 */
public class Estudiante {
    
    Materia materia;
    Profesor profesor;
    Tramites tramite;
    Calificacion calificacion;
    Convocatoria convocatoria;
            
    public String nombre;
    public String apellido;
    public String pregrado;
    public String materias_inscritas;
    public int ID;
    private int edad;
    private double papa;

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public void setTramite(Tramites tramite) {
        this.tramite = tramite;
    }

    public void setCalificacion(Calificacion calificacion) {
        this.calificacion = calificacion;
    }

    public void setConvocatoria(Convocatoria convocatoria) {
        this.convocatoria = convocatoria;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setPregrado(String pregrado) {
        this.pregrado = pregrado;
    }

    public void setMaterias_inscritas(String materias_inscritas) {
        this.materias_inscritas = materias_inscritas;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPapa(double papa) {
        this.papa = papa;
    }

    public Materia getMateria() {
        return materia;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public Tramites getTramite() {
        return tramite;
    }

    public Calificacion getCalificacion() {
        return calificacion;
    }

    public Convocatoria getConvocatoria() {
        return convocatoria;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getPregrado() {
        return pregrado;
    }

    public String getMaterias_inscritas() {
        return materias_inscritas;
    }

    public int getID() {
        return ID;
    }

    public int getEdad() {
        return edad;
    }

    public double getPapa() {
        return papa;
    }

    
    
    
}
