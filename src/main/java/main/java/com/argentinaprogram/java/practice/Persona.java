/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprogram.java.practice;

/**
 *
 * @author guillermo
 */
public class Persona {
    
    private String dni;
    private String nombre;
    private String apellido;
    private String direccion;
    private String celular;
    private int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    public void message(){
        System.out.println("Nombre: " + this.getNombre() +
                    ", apellido: " + this.getApellido()+
                    ", edad: " + this.getEdad());
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCelular() {
        return celular;
    }

    public int getEdad() {
        return edad;
    }
    
    
    
}
