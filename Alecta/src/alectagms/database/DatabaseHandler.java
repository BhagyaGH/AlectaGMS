/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package alectagms.database;
import java.sql.*;
import java.util.Properties;

public class DatabaseHandler {
protected Connection connection;

// method to get details about an SQL exception once its thrown by a method
protected void displaySQLErrors(SQLException ex){
    System.out.println("SQLException : "+ex.getMessage());
    System.out.println("SQLState : "+ex.getSQLState());
    System.out.println("VendorError: "+ex.getErrorCode());    
}

//constructor creates an instance of the Driver class
    public DatabaseHandler() {
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        }
        catch(Exception ex){
            System.out.println("Driver class not found");
        }     
        }
  
  // connect to the database by passing the username and password through a Properties object
  //  "jdbc:mysql://localhost:3306/AlectaDB" specifies the URL of the database we want to access
    protected void connectDB(Properties prop){
        try{
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/AlectaDB",prop);
        }catch(SQLException ex){
            displaySQLErrors(ex);
        }
    }
    
    // execute the query written as a string and manipulate the result given as a result set;
    public void executeQuery(){
        try{
        Statement st = connection.createStatement();
        
        ResultSet rs = st.executeQuery("Select * from EmployeeDetails");
        
        while(rs.next()){
            System.out.println(rs.getString(1)+"    "+rs.getString(2)+"     "+rs.getString(2));
        }
        }
        catch(SQLException ex){
            displaySQLErrors(ex);
        }
        
    }
}
