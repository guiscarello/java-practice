/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprogram.java.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

/**
 *
 * @author guillermo
 */
public class PracticaJDBC {

    public static void primerProblema(){
        
        DataBase db = new DataBase();
        Scanner input = new Scanner(System.in);
        
        while (true) {
                      
            System.out.println("Datos del nuevo producto:");
            System.out.println("Nombre del producto:");
            String nombre = input.nextLine();
            System.out.println("Marca del producto:");
            String marca = input.nextLine();
            System.out.println("Precio del producto:");
            String precio = input.nextLine();
            System.out.println("Stock del producto:");
            String cantidad_stock = input.nextLine();

            String query = "INSERT INTO `productos` "
                    + "(`nombre`, `marca`, `precio`, `cantidad_stock`)"
                    + "VALUES ('" + nombre + "', '" + marca + "', '" + precio + "', '" + cantidad_stock + "');";
            
            try(Connection conn = db.getConnection();) {
                try (Statement stmt = conn.createStatement()){
                    stmt.executeUpdate(query);
                    System.out.println("Registro ingresado correctamente");

                } catch (SQLException e) {
                    System.out.println("Statement error: " + e);
                }
            } catch (SQLException e) {
                System.out.println("Connection error: " + e);
            } 
            
            System.out.println("Desea ingresar otro producto? (S/N)");
            String salir = input.nextLine();
            if(salir.equals("N")){
                break;
            }
        }
    }
    
}
