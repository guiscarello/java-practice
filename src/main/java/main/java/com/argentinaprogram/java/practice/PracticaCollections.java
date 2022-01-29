/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprogram.java.practice;

import com.argentinaprogram.java.practice.Enum.MarcaAuto;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author guillermo
 */
public class PracticaCollections {
    
    public static void primerProblema(){
        List<Mascota> mascotas = new ArrayList<>();
        
        mascotas.add(new Mascota("Paco", "Perro", "Macho", "marron", "Pointer"));
        mascotas.add(new Mascota("Micky", "Perro", "Macho", "Blanco", "Dalmata"));
        mascotas.add(new Mascota("La Pipi", "Perro", "Muchachita", "Negro, marron", "Beagle"));
        mascotas.add(new Mascota("Sur", "Perro", "Macho", "Negro", "Mantonegro"));
        mascotas.add(new Mascota("Enrique", "Gato", "Macho", "Colorido", "Gato"));
        
        System.out.println("Mascotas dicen:");
        for( Mascota mascota : mascotas){
            mascota.mascotaDice();

            if(mascotas.indexOf(mascota) == 1){
                mascota.setNombre("Rodrigo");
            } else if (mascotas.indexOf(mascota) == 2){
                mascota.setNombre("Berto");
            }           
        }
        
        System.out.println("Mis mascotas despues de cambiarles el nombre dicen:");
        
        for( Mascota mascota : mascotas){
            mascota.mascotaDice();
        }
         
        mascotas.add(new Mascota("Pigy", "Chancho", "muchachito", "rosadito", "de los que se tiran en el barroooo"));
        mascotas.add(new Mascota("Igy", "Iguana", "A no se", "verdecito/a", "de loas que se esconden"));
        
        System.out.println("Mis perros dicen:");
        for( Mascota mascota : mascotas){
            if(mascota.getEspecie().equals("Perro")){
               mascota.mascotaDice();
            }
        }
    }
    
    public static void segundoProblema(){
        
        List <Persona> personas = new LinkedList<>();
        List <Persona> personasMayoresDeEdad = new LinkedList<>();
        List <Persona> personasMenoresDeEdad = new LinkedList<>();
        
        personas.add(new Persona("Guillermo", "Scarello", 32));
        personas.add(new Persona("Bruce", "Wayne", 38));
        personas.add(new Persona("The", "Joker", 42));
        personas.add(new Persona("Clark", "Kent", 36));
        personas.add(new Persona("Lois", "Lane", 33));
        personas.add(new Persona("Morty", "Smith", 16));
        personas.add(new Persona("Rick", "Sanchez", 53));
        personas.add(new Persona("El", "Guacho", 13));
        
        for(Persona persona : personas){
            if (persona.getEdad() < 18){
                personasMenoresDeEdad.add(persona);
            } else {
                personasMayoresDeEdad.add(persona);
            }        
        }
        
        System.out.println("Mayores de edad: ");
        for(Persona persona : personasMayoresDeEdad){
            persona.message();
        }
        
        System.out.println("");
        
        System.out.println("Menores de edad: ");
        for(Persona persona : personasMenoresDeEdad){
            persona.message();
        }
        
    }
    
    public static void tercerProblema(){
        
        Stack<Auto> autos = new Stack<>();
        
        autos.push(new Auto("SJS 500",MarcaAuto.Wolkswagen, "Gol Power", "rojo"));
        autos.push(new Auto("ADS 250",MarcaAuto.Fiat, "Duna", "blanco"));
        autos.push(new Auto("GSD 233",MarcaAuto.Wolkswagen, "Gol trend", "verde"));
        autos.push(new Auto("HSV 163",MarcaAuto.Ford , "Falcon", "rosado"));
        autos.push(new Auto("ADE 658",MarcaAuto.Ford, "S100", "azul"));
        autos.push(new Auto("AAW 986",MarcaAuto.Fiat, "Palio", "blue"));
        autos.push(new Auto("AWQ 001",MarcaAuto.Ford, "Fiesta", "negro"));
        
        System.out.println("Id auto rojo");
        for(Auto auto : autos){
           if(auto.getColor().equals("rojo")){
               System.out.println(autos.search(auto));
           }
        }
        
        Auto topAuto = autos.peek();
        System.out.println("Color auto en el tope:");
        System.out.println(topAuto.getColor());
        
        Auto topAutoRemoved = autos.pop();
        System.out.println("Auto en el tope removido:");
        System.out.println(topAutoRemoved.getColor());
        
        topAuto = autos.peek();
        System.out.println("Nuevo color auto en el tope:");
        System.out.println(topAuto.getColor());
        
        autos.push(new Auto("AWE 010",MarcaAuto.Fiat, "Uno", "gris"));
        autos.push(new Auto("GEW 555",MarcaAuto.Ford, "Maverick", "plateado"));
        
        topAuto = autos.peek();
        System.out.println("Nuevo color auto en el tope despues de insercion:");
        System.out.println(topAuto.getColor());
    }
}
