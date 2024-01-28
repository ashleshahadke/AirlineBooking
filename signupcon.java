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
public class signupcon {
 Statement s;
 Connection con ; 
 public void con(){
    
     try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        //String url;
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sign","root","Ash@9766");
        System.out.println("success");
  s=con.createStatement();
    }
    catch(Exception ex){
        ex.printStackTrace();

}}
public static void main(String args[]){
signupcon co =new signupcon();
co.con();


}   }
