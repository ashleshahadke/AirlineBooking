/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airline_reservation;
import java.sql.*;

/**
 *
 * @author LENOVO
 */
public class Conn {
Statement s;


Connection conn ;
Conn(String url){
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        //String url;
        conn = DriverManager.getConnection("jdbc:mysql:///sign.root.Ash@9766");
  s=conn.createStatement();
    }
    catch(Exception ex){
        ex.printStackTrace();

}}
public static void main(String args[]){
    Conn co=new Conn();
   
}    

    Conn() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
