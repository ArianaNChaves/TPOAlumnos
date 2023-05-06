/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpalumnos;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    Integer legajo;
    String apellido;
    String nombre;
    List<Materia> materias;

    public Alumno(Integer legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        materias = new ArrayList<>();
    }

    public Alumno() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
    public Integer getLegajo() {
        return legajo;
    }

    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarMateria(Materia m) {
        if (!materias.contains(m)) {
            this.materias.add(m);
        } else {
            System.out.printf("El alumno %s ya esta inscripto en la materia %s", this.nombre, m.getNombre());
        }

    }

    public Integer cantidadMaterias() {
        return materias.size();
    }
}
