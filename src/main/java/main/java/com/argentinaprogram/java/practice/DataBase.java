/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprogram.java.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author guillermo
 */
public class DataBase {
    
    private String serverName = "localhost";
    private String portNumber = "3306";
    private String userName = "root";
    private String password = "lalala";
    private String dbms = "mariadb";
    private String db = "jdbc-practice";

    public DataBase() {
        
    }

    public Connection getConnection() throws SQLException{
        
        Connection conn = null;
        
        Properties connProps = new Properties();
        
        connProps.put("user", this.userName);
        connProps.put("password", this.password);
        
        if(this.dbms.equals("mariadb")){
            conn = DriverManager.getConnection(
                    "jdbc:" + this.dbms + "://" +
                    this.serverName + 
                    ":" + this.portNumber + "/" +
                     this.db,
                    connProps
            );
        }
    
        return conn;
    }
    
}
