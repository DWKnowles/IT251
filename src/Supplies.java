/*
 * Course: IT152
 * Professor: Linnea Hall
 * Programmer: Dale Knowles
 */

/**
 *
 * @author Dale
 */
public class Supplies extends Accounts{
   private int numSupplies;
   private double priceSupplies;
  
   Supplies(double price, int qty){
      priceSupplies = price;
      numSupplies = qty;
      double getTotalSales;
   }
   
   Supplies(int accountId){
      
   }
   
   public int getNumLbPaper() {
      return numSupplies;
   }

   public void setNumLbPaper(int numSupplies) {
      this.numSupplies = numSupplies;
   }

   public double getPriceLbPaper() {
      return priceSupplies;
   }

   public void setPriceLbPaper(double priceSupplies) {
      this.priceSupplies = priceSupplies;
   }
   
   
}
