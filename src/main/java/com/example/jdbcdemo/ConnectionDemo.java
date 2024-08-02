package com.example.jdbcdemo; 
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 
import java.sql.Statement; 
 
public class ConnectionDemo { 
    public static void main(String[] args) throws ClassNotFoundException { 
        //String q = "INSERT INTO staff_master (staff_name, dept_cd, hire_date) VALUES ('ram', 2, '1990-05-25')"; 
         
        Class.forName("com.mysql.cj.jdbc.Driver"); 
         
        try { 
         Connection cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "Suchi@1007"); 
         System.out.println("connceted successfully"); 
 
        } catch (SQLException e) { 
            e.printStackTrace(); 
        } 
    } 
}