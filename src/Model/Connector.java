/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Lab Informatika
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
    private static Connection connection;
    
    public static Connection getConnection(){
        try {
            String url = "jdbc:mysql://localhost:3306/employee_db";
            String user = "root";
            String password = "";
            
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            connection = DriverManager.getConnection(url, user, password);
            
            System.out.println("Koneksi ke database berhasil..");
        } catch (Exception e) {
            System.out.println("Koneksi ke database gagal: " + e.getMessage());
        }
        return  connection;
    }
}
