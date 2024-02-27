package bank.management.system;
import java.sql.*;


public class Conn {
   Connection c;
   Statement s;
    public Conn(){
        try{

         c=DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root", "udhbhavischeater");
         s= c.createStatement();
        }
        catch(Exception e){
         System.out.println(e);
        }
    }


}

//register the driver
//create connection
//create statement
//executing query
//close connection