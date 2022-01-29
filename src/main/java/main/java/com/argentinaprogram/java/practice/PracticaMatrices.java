/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprogram.java.practice;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author guillermo
 */
public class PracticaMatrices {
    
    public static void primerProblema(){
        int numPlayers = 5;
        int numMatches = 3;
        int gols[][] = new int[numPlayers][numMatches];
        float avg[] = new float[numPlayers];
        Scanner input = new Scanner(System.in);
        
        for(int i=0; i<numPlayers;i++){
            System.out.println("Player " + (i+1));
            for (int j = 0; j < numMatches; j++) {
                System.out.println("Enter gols made in match " + (j+1) + ":");
                int gol = input.nextInt();
                gols[i][j] = gol;
            }
        }
        for(int i=0; i<numPlayers;i++){
            float sum = 0;
            for (int j = 0; j < numMatches; j++) {
               sum += gols[i][j];
            }
            avg[i] = sum / numMatches;
        }

        System.out.println("Average gols: ");
        for(float a : avg){
            System.out.println(String.format("%.2f", a) + " ");
        }
    }
    
    public static void segundoProblema(){
        int numberStudents = 10;
        int numberGrades = 3;
        float studentGrades[][] = new float[numberStudents][numberGrades + 1];
        Scanner input = new Scanner(System.in);
        
        for(int i=1; i <= numberStudents ; i++){
            float grades = 0;
            System.out.println("Student" + i);
            for(int j=1; j <= numberGrades ; j++){
                System.out.println("Enter grade n° " + j + " :");
                float inputedGrade = input.nextFloat();
                grades += inputedGrade;
                studentGrades[i-1][j-1] = inputedGrade;
            }
            studentGrades[i-1][3] = grades/numberGrades;
        }
        
        System.out.println("Average grades");
        for(float[] grade : studentGrades){
            System.out.println(grade[3]);
        }
    }

    public static void tercerProblema(){
        short dim = 4;
        short matrix[][] = new short[dim][dim];
        
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                if(i == j){
                    matrix[i][j] = 0;
                } else {
                    matrix[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                System.out.print(matrix[i][j] + "");
            }
            System.out.println("");
        }
    }
    
    public static void cuartoProblema(){
        int numDishes = 20;
        int dishInfo = 5;
        String menu[][] = new String[numDishes][dishInfo];
        Scanner input = new Scanner(System.in);
        Scanner getDishId = new Scanner(System.in);
        
        for (int i = 0; i < numDishes; i++) {
            System.out.println("Enter info for dish: " + (i+1));
            String info;
            for (int j = 0; j < dishInfo; j++) {
                if(j == 0){
                   System.out.print("Enter dish name:"); 
                } else {
                    System.out.print("Enter dish info:"); 
                }
                System.out.println("");
                info = input.nextLine();
                
                if(info.isEmpty()){
                    menu[i][j] = "Ninguno";
                    
                } else {
                    menu[i][j] = info;
                }
            }  
        }
        
        while(true){
            System.out.println("Enter dish number to get info");
            for (int i = 0; i < numDishes; i++) {
                System.out.println(i + " - " + menu[i][0]);
            }
            int dishId = getDishId.nextInt();
            System.out.print("Dish Info: ");
            for (int j = 1; j < dishInfo; j++) {
                
                System.out.print(menu[dishId][j] + " ");
            }
            System.out.println("");
        }
        
    }
}
