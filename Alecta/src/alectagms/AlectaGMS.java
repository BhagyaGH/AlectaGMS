/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alectagms;
import alectagms.database.OrderDBHandler;
import java.util.ArrayList;
/**
 *
 * @author HP
 */
public class AlectaGMS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //public Order(int orderReference, int gamentItemCode, String customer, int quentity, Date deadLine, Date timestamp, String status)
        Order test = new Order();
        test.setGamentItemCode(456);
        test.setCustomer("Customer2");
        test.setQuantity(234);
        test.setStatus("Ready");
       
        //System.out.println(test.getCustomer());
        OrderDBHandler handler = new OrderDBHandler();
      //  handler.enterOrder(test);
      //  handler.deleteOrder(3);
//       ArrayList<Order> list=handler.searchOrder("deadline","2013-10-07");
//       System.out.println("size --  "+list.size());
//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i).getOrderReference()+"    " +list.get(i).getQuantity());
        //select * from alectadb.`order` where `order`.`orderReference`=1;
      //  Order ord = handler.searchOrder("OrderReference","1");
       // System.out.println(ord.getCustomer());
    handler.updateOrder("customer","Baba",1);
    handler.updateOrder("customer","Hass", 4);
    //}
    }
    }
