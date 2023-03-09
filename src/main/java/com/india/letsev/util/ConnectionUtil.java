package com.india.letsev.util;

import com.india.letsev.exception.LetsEVDBException;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtil {

    public static Connection getConnection() throws LetsEVDBException{
        Connection connection=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lets-ev","root","Omprakash@123");

        }catch (Exception e){
            System.out.println(e);
            throw  new LetsEVDBException("Exception occured while creating the connection");
        }

        return connection;
    }

}
