/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tpalumnos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;

public class Materia {
    private Integer codigoMateria;
    private String nombre;
    private Integer ano;
    private HashMap<Integer, String> listaMaterias=new HashMap<Integer, String>();

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
    
    public boolean agregarMateria(Integer codigoMateria, String nombre, Integer ano){
        boolean agregado=false;
        if(!listaMaterias.containsKey(codigoMateria)){
            listaMaterias.put(codigoMateria, nombre);
            agregado=true;
        }
        return agregado;
    }

}