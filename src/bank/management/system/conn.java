package bank.management.system;
import java.sql.*;
public class conn {
   Connection c;
    public Conn(){
        try{
         Class.forName(com.mysql.cj.jdbc.Driver);
         c=DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root", "udhbhavischeater");
        }
        catch(Exception e){

        }
    }


}

//register the driver
//create connection
//create statement
//executing query
//close connection