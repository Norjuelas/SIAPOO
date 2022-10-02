/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.pkg3;

/**
 *
 * @author Jeison Diaz y Nicolas Orjuela 
 */
public class EstudianteTutor {
    
    Materia materia;
    
    public String nombre;
    private String apellido;
    public int edad;
    public String materia_tutoreada;

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setMateria_tutoreada(String materia_tutoreada) {
        this.materia_tutoreada = materia_tutoreada;
    }

    public Materia getMateria() {
        return materia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getMateria_tutoreada() {
        return materia_tutoreada;
    }
    
    
    
}
