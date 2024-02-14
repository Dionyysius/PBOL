/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ACER
 */
public class latihan1 {
    public static void main(String[] args) {
        System.out.println("PROGRAM LATIHAN JDBC");
        System.out.println("============================");
        
        System.out.println("Mencoba membuat koneksi ke database ");
        latihan1 p = new latihan1();
        Connection conn = p.getConnection();
         try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }


       

        
    }
    public Connection getConnection() {
        String jdbcURL = "jdbc:oracle:thin:@localhost:1521:xe";
        String port = "1521";
        String user = "SYSTEM";
        String password = "SYSTEM";
        Connection conn = null;
        String host = "localhost";
        String db = "xe";
          conn = null;

        
        

        try {
        // Memuat driver JDBC Oracle
        Class.forName("oracle.jdbc.driver.OracleDriver");
        
        // Membuat koneksi
        conn = DriverManager.getConnection("jdbc:oracle:thin:@" + host + ":" + port + ":" + db, user, password);

        System.out.println("Koneksi ke database berhasil terbentuk");
    } catch (ClassNotFoundException ex) {
        System.out.println("Maaf, driver class tidak ditemukan");
        System.out.println(ex.getMessage());
    } catch (SQLException ex) {
        System.out.println("Maaf, koneksi tidak berhasil.");
        System.out.println(ex.getMessage());
    }
        return conn;

    
}

    }


