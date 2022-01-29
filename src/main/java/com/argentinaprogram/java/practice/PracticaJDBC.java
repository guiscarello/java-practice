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
import java.util.ArrayList;
import java.util.List;
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
    
    public static void segundoProblema() {
        
        DataBase db = new DataBase();
        List<String> videosList = new ArrayList<>();
        
        String query = "SELECT * FROM `videos`;";
        
        try(Connection conn = db.getConnection();){
            try (Statement stmt = conn.createStatement();){
                
                ResultSet rs = stmt.executeQuery(query);
                while(rs.next()){
                    videosList.add(rs.getString("url"));
                }
                
            } catch (Exception e) {
                System.out.println("Statement error: " + e);
            }
        } catch (SQLException e){
            
            System.out.println("Connection error: " + e);
        
        }
        
        for(String video : videosList){
            System.out.println("Video url: " + video);
        }
        
    }
    
    public static void tercerProblema(){
        
        DataBase db = new DataBase();
        String delete = "DELETE FROM `clientes` WHERE `compartio`= 0 OR `comento`= 0;";
        String getRecords = "SELECT * FROM `clientes`;";
        List <Cliente> clientes = new ArrayList<>();
        
        try( Connection conn = db.getConnection()){
            try(Statement stmt = conn.createStatement()){
                stmt.executeQuery(delete);
                ResultSet rs = stmt.executeQuery(getRecords);
                while(rs.next()){
                    clientes.add(new Cliente(
                            rs.getString("nombre"),
                            rs.getString("apellido"),
                            rs.getInt("edad"),
                            rs.getBoolean("compartio"),
                            rs.getBoolean("comento")
                    ));
                }
            } catch (SQLException e){
                System.out.println("Statement error" + e);
            }
        } catch (SQLException e){
            System.out.println("Connection error" + e);
        }
        
        for(Cliente cliente : clientes){
            cliente.message();
        }
    }

    public static void cuartoProblema(){
        
        DataBase db = new DataBase();
        String query = "UPDATE `empleados` SET `sueldo` = '80000' WHERE `cargo` = 'programador'";
    
        try(Connection conn = db.getConnection()){
            try (Statement stmt = conn.createStatement()){
                stmt.executeQuery(query);
                System.out.println("Records updated!");
            } catch (SQLException e) {
                 System.out.println("Statement error: " + e);
            }
        } catch (SQLException e){
            System.out.println("Connection error: " + e);     
        }
        
    }

}
