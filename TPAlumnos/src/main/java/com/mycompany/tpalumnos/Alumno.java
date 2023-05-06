/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpalumnos;


import java.util.HashMap;
import java.util.List;

public class Alumno {

    private Integer legajo;
    private String apellido;
    private String nombre;
    private HashMap<Integer, String> listAlumnos=new HashMap<Integer,String>();

    public Alumno() {
    }

    public Alumno(Integer legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;

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
    
    public boolean agregarAlumno(Integer legajo, String apellido, String nombre){
        boolean agregado=false;
        if (!listAlumnos.containsKey(legajo)){
            listAlumnos.put(legajo, nombre);
            agregado=true;
        }
        
        return agregado;
    }



}
