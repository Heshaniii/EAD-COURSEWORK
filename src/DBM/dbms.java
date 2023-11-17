/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DBM;

/**
 *
 * @author 97150
 */
import java.sql.*;

public class dbms {

    public static Connection c;
    public static String dbs;

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/";
            String un = "root";
            String pw = "";
            c = DriverManager.getConnection(url + "seatticket" + "?useSSL=false", un, pw);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void iud(String query) throws Exception {
        Statement s = c.createStatement();
        int x = s.executeUpdate(query);
        System.out.println(x);
    }

    public static ResultSet search(String query) throws Exception {
        Statement s = c.createStatement();
        ResultSet r = s.executeQuery(query);
        return r;
    }
}
