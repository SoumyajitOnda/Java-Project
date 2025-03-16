package com.bank.manage;
import java.sql.Connection;
import java.sql.DriverManager;

public class connect {
    static Connection con;
    public static Connection create() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String user = "root";
            String password = "Soumyajit@123";
            String url = "jdbc:mysql://localhost:3306/Soumyajit_boss";
            con = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
