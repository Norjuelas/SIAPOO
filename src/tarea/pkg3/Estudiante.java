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
    
    private Materia materia;
    private Profesor profesor;
    private Tramites tramite;
    private Calificacion calificacion;
    private Convocatoria convocatoria;
            
    private String nombre;
    private String apellido;
    private String pregrado;
    private String materiasInscritas;
    private int ID;
    private int edad;
    private double papa;
//setter
    
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

    public void setMateriasInscritas(String materiasInscritas) {
        this.materiasInscritas = materiasInscritas;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
//getter
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

    public String getMateriasInscritas() {
        return materiasInscritas;
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

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPapa(double papa) {
        this.papa = papa;
    }

    
}
