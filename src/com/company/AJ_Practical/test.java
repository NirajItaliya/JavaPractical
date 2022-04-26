package com.company.AJ_Practical;

import java.sql.*;
import java.util.*;

public class test {

    private ResultSet rs;
    private Connection con;
    private Statement statement;
    private static Scanner sc;
    private String query, address, customerName;
    private static int accountNumber, affectedRows, balance, phone, choice;

    public test() throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/PRACTICALS", "root", "password");
        sc = new Scanner(System.in);
        statement = con.createStatement();

    }

    public void delete() throws Exception {
        System.out.println("ENTER ACCOUNT NUMBER: ");
        accountNumber = Integer.parseInt(sc.nextLine());
        query = "delete from Bank where AccountNo = " + accountNumber + ";";
        affectedRows = statement.executeUpdate(query);
        System.out.println("DELETED SUCCESSFULLY FROM Bank TABLE TOTAL ROWS AFFECTED : " + affectedRows);

    }

    public void update() throws Exception {
        System.out.println("ENTER ACCOUNT NUMBER: ");
        accountNumber = Integer.parseInt(sc.nextLine());
        System.out.println("ENTER NEW NAME");
        String newDetail = sc.nextLine();
        query = "update Bank set CustomerName = '" + newDetail + "' where AccountNo = " + accountNumber + ";";
        affectedRows = statement.executeUpdate(query);
        System.out.println("UPDATED SUCCESSFULLY THE Bank TABLE TOTAL ROWS AFFECTED : " + affectedRows);
    }

    public void insert() throws Exception {
        System.out.println("ENTER ACCOUNT NUMBER: ");
        accountNumber = Integer.parseInt(sc.nextLine());
        System.out.println("ENTER CUSTOMER NAME: ");
        customerName = sc.nextLine();
        System.out.println("ENTER ADDRESS: ");
        address = sc.nextLine();
        System.out.println("ENTER BALANCE: ");
        balance = Integer.parseInt(sc.nextLine());
        System.out.println("ENTER PHONE NUMBER: ");
        phone = Integer.parseInt(sc.nextLine());
        query = "insert into Bank() values(" + accountNumber + ",'" + customerName + "'," + balance + "," + phone + ",'" + address + "');";
        affectedRows = statement.executeUpdate(query);
        System.out.println("INSERTED SUCCESSFULLY INTO Bank TABLE TOTAL ROWS AFFECTED : " + affectedRows);

    }

    public void display() throws Exception {

        query = "select * from Bank where Balance >= 20000;";
        rs = statement.executeQuery(query);
        while (rs.next()) {

            System.out.println("ACCOUNT NUMBER : " + rs.getInt(1));
            System.out.println("CUSTOMER NAME : " + rs.getString(2));
            System.out.println("BALANCE : " + rs.getInt(3));
            System.out.println("PHONE : " + rs.getInt(4));
            System.out.println("ADDRESS :" + rs.getString(5));
        }

    }

    public static void main(String args[]) {
        try {
            System.out.println("ENROLLMENT:200130107511");


            test obj = new test();
            while (true) {
                System.out.println("SELECT OPERATION:\n1.INSERT\n2.UPDATE\n3.DELETE\n4.DISPLAY\n5.EXIT");
                choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        obj.insert();
                        break;
                    case 2:
                        obj.update();
                        break;
                    case 3:
                        obj.delete();
                        break;
                    case 4:
                        obj.display();
                        break;
                    case 5:
                        System.out.println("Exiting.....");
                        System.exit(1);
                    default:
                        System.out.println("Enter valid choice");
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}