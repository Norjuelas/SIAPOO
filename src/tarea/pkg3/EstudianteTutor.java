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
    
    private Materia materia;
    
    private String nombre;
    private String apellido;
    private int edad;
    private String materia_tutoreada;

//---setter
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
//--getter

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
