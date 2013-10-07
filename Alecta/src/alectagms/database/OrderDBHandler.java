/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package alectagms.database;

import alectagms.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class OrderDBHandler extends DatabaseHandler{

    public OrderDBHandler() {
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        }
        catch(Exception ex){
            System.out.println("Driver class not found");
        }
    }
      
    public boolean enterOrder(Order ord){
         try{  
        String query = "INSERT INTO alectadb.`order` (`garmentItemCode`, customer, quantity, status) \n" +
"VALUES ("+ord.getGamentItemCode()+",'"+ord.getCustomer()+"',"+ord.getQuantity()+",'Not Started');";
             System.out.println(query);
        this.executeUpdate(query);
        return true;
         }
         catch(Exception ex){
             System.out.println("Exception at enterorder");
             return false;
         }
    }
    
    
   public void updateOrder(){
   
   } 
    // method to search the order by entering the relevant criteria 
   public ArrayList<Order> searchOrder(String field,String argument){
      String query=null;
       try{
          int arg = Integer.parseInt(argument);
          query = "select * from alectadb.`order` where `"+field+"` = "+arg;
           System.out.println(query);
      }catch(NumberFormatException ex){
          query = "select * from alectadb.`order` where `"+field+"` = '"+argument+"'";
           System.out.println(query);
      }
       
      ResultSet rs = this.executeQuery(query);
      ArrayList<Order> list = new ArrayList<>();
     Order ord=null;
      try{
      while(rs.next()){
          
      ord = this.createOrderObject(rs);
      
        if(ord != null)
            list.add(ord);
      }
      }
      catch(SQLException ex){
      this.displaySQLErrors(ex);
      }
      
      return list;
   }
    
   public boolean deleteOrder(int ref){
         try{  
        String query = "DELETE FROM alectadb.`order` WHERE `orderReference` ="+ref;
             System.out.println(query);
        this.executeUpdate(query);
         return true;
         }
         catch(Exception ex){
             System.out.println("Exception at enterorder");
             return false;
         }
   }
  
   
   // show all orders
  public ArrayList<Order> getOrders(){
      
      ArrayList<Order> orderList = new ArrayList<Order>();
      
      try{  
        String query = "select * from alectadb.`order`";
       // Statement st = connection.createStatement();
        ResultSet rs = this.executeQuery(query);
        while (rs.next()) {
            Order ord = this.createOrderObject(rs);
            if(ord != null)
                orderList.add(ord);
        }
       
         return orderList;
         }
         catch(Exception ex){
             System.out.println(ex.toString());
             return null;
         }  
    }
  
  public Order createOrderObject(ResultSet rs){
        Order newOrder = new Order();
        try{
        newOrder.setGamentItemCode(rs.getInt("orderReference"));
        newOrder.setCustomer(rs.getString("customer"));
        newOrder.setQuantity(rs.getInt("quantity"));
        newOrder.setStatus(rs.getString("status"));
        newOrder.setDeadLine(rs.getDate("deadline"));
        newOrder.setTimestamp(rs.getTimestamp("timeOfEntry"));
        newOrder.setOrderReference(rs.getInt("orderReference"));
        
        return newOrder;
        }
        catch(SQLException ex){
            this.displaySQLErrors(ex);
            return null;
        }
  }
    
    

}
