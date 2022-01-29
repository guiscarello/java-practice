/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprogram.java.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author guillermo
 */
public class PracticaVectores {
    
    
    public static void primerProblema(){
        Scanner teclado = new Scanner(System.in);
        int vector[] = new int[10];
        
        for(int i = 0; i < vector.length; i++){
             System.out.println("Enter next value: ");
             int value = teclado.nextInt();
             while(true){
                 if(value>=1 && value<=100){
                     vector[i] = value;
                     break;
                 }else{
                     System.out.println("Wrong number, please try again:");
                     value = teclado.nextInt();
                 }
             }            
        }
        System.out.println("The values of the vecor are: ");
        for(int value: vector){
            System.out.println(value);
        }
    }
    
    public static void segundoProblema(){
        
        int edadesAlumnos[] = new int[15];
        
        for(int i=0; i < edadesAlumnos.length; i++){
            Random randomEdad = new Random();
            int edadMaxima = 18;
            int edadMinima = 7;
            edadesAlumnos[i] = randomEdad.nextInt(edadMaxima-edadMinima) + edadMinima;
        }
        
        int edadMaxima = 0;
        int edadMinima = 18;
        
        System.err.print("Ages: ");
        for(int edad: edadesAlumnos){
            System.err.print(edad + ", ");
            if(edad > edadMaxima){
                edadMaxima = edad;
            }
            if(edad < edadMinima){
                edadMinima = edad;
            }
        }
        
        System.out.println("Max. age: " + edadMaxima);
        System.out.println("Min. age: " + edadMinima);

    }
    
    public static void tercerProblema(){
        Scanner tecaldo = new Scanner(System.in);
        System.err.println("Enter your name:");
        String name[] = new String[1]; 
        name[0] = tecaldo.next();
        System.err.println("Enter your lastname:");
        String lastname[] = new String[1]; 
        lastname[0] = tecaldo.next();
        System.err.println("Enter your dni:");
        String dni[] = new String[1]; 
        dni[0] = tecaldo.next();
        
        System.err.println("Name: " +  name[0] + ", Lastname: " + lastname[0] + ", DNI: " + dni[0]);
    }
    
    public static void cuartoProblema(){
        
        short minTemp = -10;
        short maxTemp = 70;
        Float temperatures[] = new Float[23];

        for(int i=0; i<temperatures.length;i++){
            Random randomTemp = new Random();
            temperatures[i] = minTemp + randomTemp.nextFloat() * (maxTemp - (minTemp));
            //System.out.println(String.format("%.1f", temperatures[i]));
        }
        
        /*
        float maxTemperatures[] = new float[5];
        int index = 0;
        
        for(float t : temperatures){
            int counter = 0;
            
            for(int i=0; i < temperatures.length;i++){
                if(t > temperatures[i]){
                    counter ++;
                }
            }
            if(counter >= 18){
                maxTemperatures[index] = t;
                index++;
            }
        }  
        */
        
        System.out.print("Temp:" );
        for(float t : temperatures){
            System.out.print(" " + String.format("%.1f", t) + "," );
        }
        
        System.out.println("");
        
        Arrays.sort(temperatures, Collections.reverseOrder());
        
        System.out.print("Max. temp:" );
        for(int i = 0; i < 5; i++){
            System.out.print(" " + String.format("%.1f", temperatures[i]) + "," );
        }

    }     
      
    public static void quintoProblema(){
        
        int numOfAnimals = 10;
        Scanner input = new Scanner(System.in);
        String animals[] = new String[numOfAnimals];
        String animalsReversed[] = new String[numOfAnimals];
        
        for(int i=0; i<animals.length;i++){
            System.out.println("Add new animal:");
            String animal = input.next();
            animals[i] = animal;
            animalsReversed[animals.length-(1+i)] = animal;
        }
        
        System.out.println("Animals: ");
        for(String animal : animals){
            System.out.print(animal + ", ");
        }
        
        System.out.println("");
        
        System.out.println("Animals reversed: ");
        for(String animal : animalsReversed){
            System.out.print(animal + ", ");
        }
        
    }
    
}
