/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.pkg3;

/**
 *
 * @author Jeison Diaz y Nicolas Orjuela
 */
public class Profesor {
    
    private Estudiante estudiantes;
    private Materia materia;
    private Calificacion calificacion;
    private Tramites tramite;
    
    private String nombre;
    private String apellido;
    private String materias;
    private int edad;
    
    public void setEstudiantes(Estudiante estudiantes) {
        this.estudiantes = estudiantes;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public void setCalificacion(Calificacion calificacion) {
        this.calificacion = calificacion;
    }

    public void setTramite(Tramites tramite) {
        this.tramite = tramite;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setMaterias(String materias) {
        this.materias = materias;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public Estudiante getEstudiantes() {
        return estudiantes;
    }

    public Materia getMateria() {
        return materia;
    }

    public Calificacion getCalificacion() {
        return calificacion;
    }

    public Tramites getTramite() {
        return tramite;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getMaterias() {
        return materias;
    }

    public int getEdad() {
        return edad;
    }
    
    
    
}
