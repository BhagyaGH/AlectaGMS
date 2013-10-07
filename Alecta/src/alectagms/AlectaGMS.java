/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alectagms;
import alectagms.database.OrderDBHandler;
import java.text.SimpleDateFormat;
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
        test.setQuentity(234);
        test.setStatus("Ready");
       
        //System.out.println(test.getCustomer());
        OrderDBHandler handler = new OrderDBHandler();
      //  handler.enterOrder(test);
        handler.deleteOrder(3);
    }
}
