/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

//import com.mysql.jdbc.PreparedStatement;
import jakarta.security.auth.message.callback.PrivateKeyCallback;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.User;
/**
 *
 * @author DELL
 */
public class UserDAO {
    public static Connection openConnection(){
        Connection con = null;
        try{
            System.out.println("Hello from DBConfig.driver " + DBconfig.driver);
            Class.forName(DBconfig.driver);
            con = DriverManager.getConnection(DBconfig.url, DBconfig.username, DBconfig.password);
            System.out.println("Connected Successfully");
        }catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }
//    public static User checkSignin(String username, String password) throws SQLException{
//        try(Connection c = openConnection()){
//            String select = String.format("Select * from users where username = '%s' and password = '%s'", username, password);
//            PreparedStatement ps = (PreparedStatement) c.prepareStatement(select);
//            ResultSet rs  = ps.executeQuery();
//            if(rs.next()){
//                return new User(rs.getInt("id"), rs.getString("username"), rs.getString("password"), rs.getString("first_name"), rs.getString("last_name"), rs.getString("gender"), rs.getString("birthday"));
//            }
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//        return null;
//    }
    //Hàm kiểm tra đăng nhập 
    public static User handleLogin(String username, String password){
         try(Connection c = openConnection()){
            String select = String.format("Select * from users where username = '%s' and password = '%s'", username, password);
            PreparedStatement ps = c.prepareStatement(select);
            ResultSet rs  = ps.executeQuery();
            if(rs.next()){
                return new User(rs.getInt("id"), rs.getString("username"), rs.getString("password"), rs.getString("first_name"), rs.getString("last_name"), rs.getString("gender"), rs.getString("birthday"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }//Hàm kiểm tra tồn tại tên đăng nhập
    public static boolean isExistUsername(String username) {
        try(Connection c = openConnection()){
            String select = String.format("select * from users where username = '%s'", username);
            PreparedStatement ps = c.prepareStatement(select);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return true;
            }
            return false;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return true;
    }
    
    public static boolean isUser(User user){
        try (Connection c = openConnection()){
            String insert = String.format("INSERT INTO users VALUES('%s', '%s');", user.getUsername(), user.getPassword());
            PreparedStatement ps = c.prepareStatement(insert);
            ResultSet rs = ps.executeQuery();
        } catch (Exception e) {
        }
        return false;
        
    }
}
