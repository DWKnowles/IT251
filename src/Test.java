
import java.util.Scanner;

/*
 * Course: IT152
 * Professor: Linnea Hall
 * Programmer: Dale Knowles
 */

/**
 *
 * @author Dale
 */
public class Test {
   public static void main(String[] args) {
      
      final double taxRate = .07;
      
      System.out.println("~Welcome User~");
      Accounts daleAccounts; //create new account object
      
      Scanner scanLine = new Scanner(System.in);
      System.out.println("Would like to specify a user name? ( [y]es/[n]o )");
         while (true) {
            String response = scanLine.nextLine(); 
            System.out.println("");
            response = response.trim().toLowerCase();
         if ( (response.equals("yes")) || (response.equals("y")) ) {
           System.out.println("Please input a user name.");
           daleAccounts = new Accounts(scanLine.nextLine());
           System.out.println("");
           break; 
         } 
         else if ( ( response.equals("no")) || (response.equals("n")) ){
            daleAccounts = new Accounts();
            break;
         }
         System.out.println("Invalid response. Please specify 'yes' or 'no'.");
         }
   // calcualte paper 
      Paper dalesPaper; //create new paper object.     
         System.out.println("How many pounds of paper would you like?");
         String lbPaper = scanLine.nextLine();
         double numLbPaper = Double.parseDouble(lbPaper);
            System.out.println("");
            
         System.out.println("Please enter the price of the paper per pound.");
         String pricePaper = scanLine.nextLine();
         double priceLbPaper = Double.parseDouble(pricePaper);
            System.out.println("");
    
      double paperTotalSales = (priceLbPaper * numLbPaper)+((priceLbPaper * numLbPaper)*taxRate);
      System.out.println("Paper Total with 7% sales tax: $" +paperTotalSales);
         System.out.println("");
      // calcualte Services 
      Services dalesServices; //create new paper object.
         System.out.println("How many hours did you work?");
         String hours = scanLine.nextLine();
         double numHours = Double.parseDouble(hours);
            System.out.println("");
            
         System.out.println("Please enter the hourly rate.");
         String rate = scanLine.nextLine();
         double hRate = Double.parseDouble(rate);
            System.out.println("");
    
      double servicesTotalSales = (hRate * numHours)+((hRate * numHours)*taxRate);
            
      System.out.println("Services total with 7% sales tax: $" +servicesTotalSales);
         System.out.println("");
         
      // calcualte Supplies 
      Supplies dalesSupplies; //create new paper object.
         System.out.println("How many supplies did you order?");
         String supplies = scanLine.nextLine();
         double numSupplies = Double.parseDouble(supplies);
            System.out.println("");
            
         System.out.println("Please enter the supplies cost.");
         String supPrice = scanLine.nextLine();
         double priceSupplies = Double.parseDouble(supPrice);
            System.out.println("");
    
      double suppliesTotalSales = (priceSupplies * numSupplies)+((priceSupplies * numSupplies)*taxRate);
            
      System.out.println("Supplies total with 7% sales tax: $" +suppliesTotalSales); 
         System.out.println("~~~~~~~~~~~~~~~~~~~~~");
         
      double grandTotal = suppliesTotalSales+servicesTotalSales+paperTotalSales;
      System.out.println("Grand total: $"+grandTotal);
      
   }
   
}
