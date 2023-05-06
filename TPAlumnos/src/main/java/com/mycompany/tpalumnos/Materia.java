/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpalumnos;

public class Materia {
    Integer codigoMateria;
    String nombre;
    Integer ano;

    public Materia() {
    }

    public Materia(Integer codigoMateria, String nombre, Integer ano) {
        this.codigoMateria = codigoMateria;
        this.nombre = nombre;
        this.ano = ano;
    }

    public Integer getCodigoMateria() {
        return codigoMateria;
    }

    public void setCodigoMateria(Integer codigoMateria) {
        this.codigoMateria = codigoMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }
    
}