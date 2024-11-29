/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataAccessObject;

import javax.swing.JOptionPane;
import model.User;
import java.sql.*;

/**
 *
 * @author SNSV
 */
public class UserDao {
    public static void save(User user){
        String query = "insert into user(nama,email,noTelpon, password) values('"+user.getNama()+"','"+user.getEmail()+"','"+user.getNoTelpon()+"','"+user.getPassword()+"')";
        DbOperation.setDataOrDelete(query, "Registrasi Berhasil!");
    }
    
    public static String login(String email, String password){
        String role;
        
        try{
            ResultSet rsUser = DbOperation.getData("select * from user where email ='"+email+"' and password ='"+password+"'");
            ResultSet rsAdmin = DbOperation.getData("select * from admin where email ='"+email+"' and password ='"+password+"'");
            if(rsAdmin.next()){
                role = "admin";
                return role;
            } else if(rsUser.next()){
                role = "user";
                return role;
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
}
