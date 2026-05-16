package com.mycompany.hotelsystem;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(
                 "jdbc:mysql://164.92.253.36:3306/hotel_management_system",
                "12323369_project_db",
                "19945042"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
