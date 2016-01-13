
import java.util.Random;
/*
 * Course: IT251
 * Professor: Angela Griffin
 * Programmer: Dale Knowles
 */

/**
 *
 * @author Dale
 */
public class Accounts {

   private static int accountId;
   private double totalSales;
   private String userName;
   
      
   Accounts(){
      this("Guest"); //set default user name
   }  
 
   Accounts(String userName){ // input a user name.
      this.userName = userName;
      System.out.println("User Name = \"" + userName + "\"");
      System.out.println("");
   }
   Accounts(int accountId){
      Random randomGenerator = new Random();
         for (int id = 1; id <= 10; ++id){
            int randomInt = randomGenerator.nextInt(100);
            System.out.println("AccountID: " +randomInt);
         }
   }
   public void setTotalSales(double price, int qty){
   
      this.totalSales = price * qty;
   }

   public double getTotalSales(){

      return totalSales;
   }
}
