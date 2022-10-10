/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.pkg3;

/**
 *
 * @author Jeison Diaz y Nicolas Orjuela
 *
 */
public class Convocatoria {
    
    private Estudiante estudiante;
    
    private String nombre_convocatoria;
    private String nombre_estudiante;
    private boolean cumple_requisitos;
    private double papa;
    private int PBM;

    //---setter

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public void setNombre_convocatoria(String nombre_convocatoria) {
        this.nombre_convocatoria = nombre_convocatoria;
    }

    public void setNombre_estudiante(String nombre_estudiante) {
        this.nombre_estudiante = nombre_estudiante;
    }

    public void setCumple_requisitos(boolean cumple_requisitos) {
        this.cumple_requisitos = cumple_requisitos;
    }

    public void setPapa(double papa) {
        this.papa = papa;
    }

    public void setPBM(int PBM) {
        this.PBM = PBM;
    }
   //--getter

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public String getNombre_convocatoria() {
        return nombre_convocatoria;
    }

    public String getNombre_estudiante() {
        return nombre_estudiante;
    }

    public boolean isCumple_requisitos() {
        return cumple_requisitos;
    }

    public double getPapa() {
        return papa;
    }

    public int getPBM() {
        return PBM;
    }
    
  
    
}
