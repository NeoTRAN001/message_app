package com.platzi.messages_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author neotran
 */
public class SqlConnection {
    public Connection getConnection() {
       Connection connection = null;
       
       try {
           connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/messages_app", "root", "");
           
           if(connection != null)
               System.out.println("Connection !!");
       } catch(SQLException e) {
           System.out.println(e);
       }
       
       return connection;
    }
}
