/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.pkg3;
/**
 *
 * @author Jeison Diaz y Nicolas Orjuela
 */
public class Materia {
    
    private EstudianteTutor estudianteTutor;
    private Estudiante estudiantes;
    private Profesor profesor;
    
    private String nombre;
    private int creditos;
    private String grupo;
    private String monitor;

    //---getter
    public EstudianteTutor getEstudianteTutor() {
        return estudianteTutor;
    }

    public Estudiante getEstudiantes() {
        return estudiantes;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public String getGrupo() {
        return grupo;
    }

    public String getMonitor() {
        return monitor;
    }
//--setter
    public void setEstudianteTutor(EstudianteTutor estudianteTutor) {
        this.estudianteTutor = estudianteTutor;
    }

    public void setEstudiantes(Estudiante estudiantes) {
        this.estudiantes = estudiantes;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }
   
}
