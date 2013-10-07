/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package alectagms.database;

import alectagms.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class OrderDBHandler extends DatabaseHandler{

    public OrderDBHandler() {
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        }
        catch(Exception ex){
            System.out.println("Driver class not found");
        }
        
       // this.connectDB("root","fara619boss");
    }
   
   
    
    public boolean enterOrder(Order ord){
         try{  
        String query = "INSERT INTO alectadb.`order` (`garmentItemCode`, customer, quantity, status) \n" +
"VALUES ("+ord.getGamentItemCode()+",'"+ord.getCustomer()+"',"+ord.getQuentity()+",'Not Started');";
             System.out.println(query);
        this.executeQuery(query);
        return true;
         }
         catch(Exception ex){
             System.out.println("Exception at enterorder");
             return false;
         }
    }
    
    // method to search the order by entering the relevant criteria 
   // public Order searchOrder(String field,String argument){
        
   // }
    
        public boolean deleteOrder(int ref){
         try{  
        String query = "DELETE FROM alectadb.`order` WHERE `orderReference` ="+ref;
             System.out.println(query);
        this.executeQuery(query);
         return true;
         }
         catch(Exception ex){
             System.out.println("Exception at enterorder");
             return false;
         }
        }
   // public void updateOrder(){}
  public ArrayList<Order> getOrders(){
      ArrayList<Order> orderList = new ArrayList<Order>();
      
      try{  
        String query = "DELETE FROM alectadb.`order` WHERE `orderReference` ="+ref;
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery(query);
        this.executeQuery(query);
         return orderList;
         }
         catch(Exception ex){
             System.out.println("Exception at enterorder");
             return null;
         }
      
    }
    
    

}
