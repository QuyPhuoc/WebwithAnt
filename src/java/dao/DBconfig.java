/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.apache.tomcat.dbcp.dbcp2.DriverManagerConnectionFactory;

/**
 *
 * @author DELL
 */
public class DBconfig {
    public static String driver = "com.mysql.jdbc.Driver";
    public static String url ="jdbc:mysql://localhost:3306/java?autoReconnect=true&useSSL=false";
    public static String username = "phuoc";
    public static String password = "21092004";
//    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        //Nạp driver 
//        Class.forName("com.mysql.jdbc.Driver");
//        Connection con = (Connection) DriverManager.getConnection(url, username, password);
//        if(con == null){
//            System.out.println("failed!");
//        }else{
//            System.out.println("OK");
//        }
//    }
}
