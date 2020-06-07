/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author yassine
 */
public class ConnectDB {

    private static Connection connection;

    static {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "yassine", "yassine");
//            Statement stmt = (Statement) connection.createStatement();
//            PreparedStatement pr = (PreparedStatement) connection.prepareStatement("select * from tab_journal");
//            ResultSet rs = pr.executeQuery();
//            while (rs.next()) {
//                System.out.println(rs.getString(1) + "  " + rs.getDate(2) + "  " + rs.getInt(3));
//            }
//            connection.close();
            System.out.println("la connexion est etabli avec succe");
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
    public static Connection getConnection() {
        return connection;
    }
}
