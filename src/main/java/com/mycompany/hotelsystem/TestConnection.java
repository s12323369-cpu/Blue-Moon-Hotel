package com.mycompany.hotelsystem;

import java.sql.Connection;

public class TestConnection {
    public static void main(String[] args) {
        try {
            Connection con = DBConnection.getConnection();
            if (con != null) {
                System.out.println("Connected to database ✅");
            } else {
                System.out.println("Connection failed ❌");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}