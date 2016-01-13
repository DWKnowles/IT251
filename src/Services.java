/*
 * Course: IT152
 * Professor: Linnea Hall
 * Programmer: Dale Knowles
 */

/**
 *
 * @author Dale
 */
public class Services extends Accounts{
   private int numHours;
   private double hRate;
  
   Services(double price, int qty){
      hRate = price;
      numHours = qty;
      double getTotalSales;
   }
   
   Services(int accountId){
      
   }
   public int getNumLbPaper() {
      return numHours;
   }

   public void setNumLbPaper(int numHours) {
      this.numHours = numHours;
   }

   public double getPriceLbPaper() {
      return hRate;
   }

   public void setPriceLbPaper(double hRate) {
      this.hRate = hRate;
   }
   
}
