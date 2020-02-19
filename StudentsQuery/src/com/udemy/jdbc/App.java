package com.udemy.jdbc;

import java.sql.SQLException;

public class App {

    public static void main(String[] args)
    {
        StudentJDBCQuery s = new StudentJDBCQuery();
        try {
            s.readDatabase();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
