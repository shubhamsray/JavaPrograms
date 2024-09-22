/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package database;

/**
 *
 * @author Shubham
 */
import java.sql.*;
public class Database {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
//        Class.forName("org.mysql.JDBC
            
         String jdbcUrl = "jdbc:mysql://localhost:3306/mydatabase"; // replace with your DB details
        String username = "root"; // replace with your DB username
        String password = "password"; // replace with your DB password
        
        Connection con = DriverManager.getConnection(jdbcUrl);
        
        Statement stm = con.createStatement();
        
        ResultSet rs = stm.executeQuery("");
        
        while(rs.next()){
            System.out.println(rs.getInt());
                        System.out.println(rs.getInt());
            System.out.println(rs.getInt());
            System.out.println(rs.getInt());

        }
        stm.close();
        con.close();
        
    }
    
}
