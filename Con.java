
package bank.management.system;

import java.sql.*;


public class Con {
    Connection connection;
    Statement statement;
    public Con(){
        try
        {
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=bankSystem;encrypt=true;trustServerCertificate=true;","root","12345");
            statement = connection.createStatement();
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
    
    
}
