package com.example.jdbcdemo;import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class InsertionDemo
{ public static void main(String[] args) throws ClassNotFoundException {
  Class.forName("com.mysql.cj.jdbc.Driver");   try {
    Connection cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "Suchi@1007");         
    System.out.println("connceted successfully");
              Statement s = cnn.createStatement();
        String q="insert into dept values(108,'AIML')";    
             int rs = s.executeUpdate(q);             
             if (rs == 1) {               
            	 System.out.println("Inserted Successfully");
             } 
             else
             {               
            	 System.out.println("Insertion Failure");
             }             
             cnn.close();

         } catch (SQLException e) {
             e.printStackTrace();         }
 }}