/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;

/**
 *;
 * @author modis
 */
public class ConnectionProvider {
    public static Connection getcon(){
        try{
            //Class.forName("com.mysql.cj.jdbc.Driver");
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz","root","root");
            return con;
        }catch (Exception e){
            System.out.println(e);
            return null;
        }
    
    }
}
