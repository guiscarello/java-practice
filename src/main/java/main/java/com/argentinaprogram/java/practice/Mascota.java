/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprogram.java.practice;

/**
 *
 * @author guillermo
 */
public class Mascota {
    private String nombre;
    private String especie;
    private String sexo;
    private String pelaje;
    private String raza;

    public Mascota(String nombre, String especie, String sexo, String pelaje, String raza) {
        this.nombre = nombre;
        this.especie = especie;
        this.sexo = sexo;
        this.pelaje = pelaje;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public String getSexo() {
        return sexo;
    }

    public String getPelaje() {
        return pelaje;
    }

    public String getRaza() {
        return raza;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    public void mascotaDice(){
        System.out.println("Mi nombre es " + 
        this.getNombre() + ", soy un " + 
        this.getEspecie() + " y tengo un hermoso pelo " +
        this.getPelaje()
        );        
    }
    
    
    
}
