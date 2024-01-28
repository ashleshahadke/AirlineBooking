/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airline_reservation;

import java.sql.*;


public class logincon {
 Statement s;
 Connection c ; 
 public void con(){
    
     try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        //String url;
        c = DriverManager.getConnection("jdbc:mysql://localhost:3306/sign","root","Ash@9766");
        System.out.println("success");
  s=c.createStatement();
    }
    catch(Exception ex){
        ex.printStackTrace();

}}
public static void main(String args[]){
logincon co =new logincon();
co.con();


}   }
