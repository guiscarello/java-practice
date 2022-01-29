/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprogram.java.practice;

import com.argentinaprogram.java.practice.Persona;

/**
 *
 * @author guillermo
 */
public class Cliente extends Persona{
    
    private boolean compartio;
    private boolean comento;
    
    public Cliente(String nombre, String apellido, int edad, boolean compartio, boolean comento) {
        super(nombre, apellido, edad);
        this.compartio = compartio;
        this.comento = comento;
    }

}
