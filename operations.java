package com.bank.manage;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class operations {
    public static boolean createAcc(customer cs) {
        boolean f = false;
        try {
            Connection con = connect.create();
            String q = "insert into bank(name, age, ph_no, address, Total_money) values(?, ?, ?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setString(1, cs.getName());
            pstmt.setInt(2, cs.getAge());
            pstmt.setString(3, cs.getPhone_no());
            pstmt.setString(4, cs.getAddress());
            pstmt.setDouble(5, cs.getBalance());
            pstmt.executeUpdate();
            f = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }

    public static boolean deposit(int acc_no, double amount) {
        boolean f = false;
        try {
            Connection con = connect.create();
            String q = "update bank set Total_money = Total_money + ? where acc_no = ?";
            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setDouble(1, amount);
            pstmt.setInt(2, acc_no);
            pstmt.executeUpdate();
            f = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }

    public static boolean withdraw(int withdrawAccNo, double withdrawAmount) {
        boolean f = false;
        try {
            Connection con = connect.create();
            String q = "update bank set Total_money = Total_money - ? where acc_no = ?";
            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setDouble(1, withdrawAmount);
            pstmt.setInt(2, withdrawAccNo);
            pstmt.executeUpdate();
            f = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }

    public static void display() {
        try {
            Connection con = connect.create();
            String q = "select * from bank";
            Statement stmt = con.createStatement();
            ResultSet set = stmt.executeQuery(q);
            while (set.next()) {
                int acc_no = set.getInt(1);
                String name = set.getString(2);
                int age = set.getInt(3);
                String ph_no = set.getString(4);
                String address = set.getString(5);
                Double total_money = set.getDouble(6);
                System.out.println("Account Number :: " + acc_no);
                System.out.println("Name :: " + name);
                System.out.println("Age :: " + age);
                System.out.println("Mobile Number :: " + ph_no);
                System.out.println("Address :: " + address);
                System.out.println("Total Balance :: " + total_money);
                System.out.println("+++++++++++++++++++++++++++++");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean modify(String modifyName, int modifyAccNo) {
        boolean f = false;
        try {
            Connection con = connect.create();
            String q = "update bank set name = ? where acc_no = ?";
            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setString(1, modifyName);
            pstmt.setInt(2, modifyAccNo);
            pstmt.executeUpdate();
            f = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }

    public static boolean delete(int deleteAccNo) {
        boolean f = false;
        try {
            Connection con = connect.create();
            String q = "delete from bank where acc_no = ?";
            PreparedStatement pstmt = con.prepareStatement(q);
            pstmt.setInt(1, deleteAccNo);
            pstmt.executeUpdate();
            f = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }
}
