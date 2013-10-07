/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package alectagms.database;
import java.sql.*;
import java.util.Properties;

public class DatabaseHandler {
protected Connection connection;

//constructor creates an instance of the Driver class
    public DatabaseHandler() {
         
        }
  

// method to get details about an SQL exception once its thrown by a method
protected void displaySQLErrors(SQLException ex){
    System.out.println("SQLException : "+ex.getMessage());
    System.out.println("SQLState : "+ex.getSQLState());
    System.out.println("VendorError: "+ex.getErrorCode());    
}

  // connect to the database by passing the username and password through a Properties object
  //  "jdbc:mysql://localhost:3306/AlectaDB" specifies the URL of the database we want to access
  /*
    Properties prop = new Properties();
    prop.setProperty("user","root");
    prop.setProperty("password","fara619boss");
   */  
    public void connectDB(String username,String password){
           try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
               System.out.println("drive connect");
        }
        catch(Exception ex){
            System.out.println("Driver class not found");
        } 
        try{
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/AlectaDB",username,password);
            System.out.println("connected");
        }catch(SQLException ex){
            displaySQLErrors(ex);
            System.out.println("not connected :(");
        }
    }
    
    // execute the query written as a string and manipulate the result given as a result set;
    public void executeQuery(String query){
        this.connectDB("root","fara619boss" );
        try{
        Statement st = connection.createStatement();
        //ResultSet rs = st.executeQuery(query);
        st.executeUpdate(query);
        st.close();
        connection.close();
        //return rs;
        }
        catch(SQLException ex){
            displaySQLErrors(ex);
            System.out.println("query kela");
            //return null;
        }
        
    }
}
