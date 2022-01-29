/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprogram.java.practice;

/**
 *
 * @author guillermo
 */
public class Empleado extends Persona{
    
    private String cargo;
    private Float sueldo; 
    
    public Empleado(String nombre, String apellido, int edad, String cargo, Float sueldo){
        super(nombre, apellido, edad);
        this.cargo = cargo;
        this.sueldo = sueldo;
    }
}
