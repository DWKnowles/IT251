/*
 * Course: IT152
 * Professor: Linnea Hall
 * Programmer: Dale Knowles
 */

/**
 *
 * @author Dale
 */
public class Paper extends Accounts{
   private int numLbPaper;
   private double priceLbPaper;
  
   Paper(double price, int qty){
      priceLbPaper = price;
      numLbPaper = qty;
      double getTotalSales;
   }

   Paper(int accountId){
      
   }
           
   public int getNumLbPaper() {
      return numLbPaper;
   }

   public void setNumLbPaper(int numLbPaper) {
      this.numLbPaper = numLbPaper;
   }

   public double getPriceLbPaper() {
      return priceLbPaper;
   }

   public void setPriceLbPaper(double priceLbPaper) {
      this.priceLbPaper = priceLbPaper;
   }
      
}
