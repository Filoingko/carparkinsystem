package com.edu.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gihan Chathuranga
 */
public class DBConnection {
    private static DBConnection instance = null;
    private static Connection connection = null;
    private DBConnection() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        this.connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/parking_system","root","");
    }
     public static DBConnection DatabaseConnection() throws ClassNotFoundException, SQLException {
      if(instance == null) {
         instance = new DBConnection();
      }
      return instance;
   }
     
     public Connection getConnection() {
        return connection;
}
    
}
