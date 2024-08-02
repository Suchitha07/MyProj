package com.example.jdbcdemo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class SelectionDemo{
	public static void main(String[] args) throws ClassNotFoundException {
  Class.forName("com.mysql.cj.jdbc.Driver");  
  try {
    Connection cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "Suchi@1007");       
    System.out.println("connceted successfully");
          Statement s = cnn.createStatement();          
          String q="Select * from dept";           
          ResultSet rs = s.executeQuery(q);          
             System.out.println("Studentid sname");           
             while(rs.next()) {
              int code=rs.getInt("idStudent");             
              String name=rs.getString("sname");
              System.out.println(code+"       \t"+name);             }
             cnn.close();

         } catch (SQLException e) {
             e.printStackTrace();         
         }
 }
	}