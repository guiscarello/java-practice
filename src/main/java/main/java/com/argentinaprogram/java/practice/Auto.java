/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprogram.java.practice;

import com.argentinaprogram.java.practice.Enum.MarcaAuto;

/**
 *
 * @author guillermo
 */
public class Auto {
    
    private String num_patente;
    private MarcaAuto marca;
    private String modelo;
    private String color;
    private Long chasis;

    public Auto(String num_patente, MarcaAuto marca, String modelo, String color) {
        this.num_patente = num_patente;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }
    
    public String getColor(){
        return this.color;
    }
    
}
