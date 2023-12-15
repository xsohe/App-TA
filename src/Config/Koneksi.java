/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Config;

/**
 *
 * @author YANUAREKA
 */

import java.sql.DriverManager;
import java.sql.Connection;

//Koneksi ke database
public class Koneksi {
    private static Connection conn;
    
    public static Connection getConnection() {
        if(conn == null) {
            try {
                String url = "jdbc:mysql://localhost/db_app";
                String user = "root";
                String password = "";
                conn = (Connection) DriverManager.getConnection(url, user, password);
            } catch (Exception e) {
                System.err.println("Koneksi gagal" + e.getMessage());
            }
        }
        return conn;
    }
}
