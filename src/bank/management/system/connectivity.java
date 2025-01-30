package bank.management.system;

import java.sql.*;

public class connectivity {

    Connection connection ;
    Statement statement;
    public connectivity(){
       try{
           connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/banksystem","root","Paras@132");
           statement = connection.createStatement();
           System.out.println("Connection estalished");

       } catch (Exception e) {
           e.printStackTrace();
       }
    }

    public static void main(String[] args) {
        new connectivity();
    }
}
