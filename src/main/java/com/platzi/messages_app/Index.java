package com.platzi.messages_app;

import java.sql.Connection;

/**
 * @author neotran
 */
public class Index {
    public static void main(String[] args) {
        SqlConnection sqlConnection = new SqlConnection();
        
        try(Connection cnx = sqlConnection.getConnection()) {
            
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
