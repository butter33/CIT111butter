/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

import java.util.Scanner

/**
 *
 * @author michael.butter
 */
public class PurchaseCalculator {
    public static void main(String[] args){
        final double ITEM_PRICE = 100.00;
        System.out.println("Hard-coded price value: $" + ITEM_PRICE);
        double result = displayPriceWithTax(ITEM_PRICE); // literal double
        System.out.println("Returned price with tax: " + result);
        
        displayPriceWithTax(ITEM_PRICE);
        Scanner cashscanner = new Scanner (System.in);
        System.out.println("Enter units");
        double userEnteredPrice = cashscanner.nextDouble();
        displayPriceWithTax(2200.00); // literal double
        displayPriceWithTax(1000); // literal double
        computePriceAfterDiscount(100.00, .25);
        displayPurchasableNumber(100, 5000);        
    }
    
    public static double displayPriceWithTax (double price){
        final double TAX_RATE = 0.075;
        double totalPrice = price * (1 + TAX_RATE);
        System.out.println("Total price with tax: $" + totalPrice);
        return totalPrice;
    }
    public static void computePriceAfterDiscount(double price, double discount){
        double finalPrice = price - (price * discount);
        System.out.println("Price after discount: $" + finalPrice);
    }
    public static void displayPurchasableNumber (double price, double limit){
        int numPurchasable = (int) Math.floor(limit / price);
       System.out.println ("With $" + limit
        + ", you can buy" + numPurchasable + "units"); 
    }
}
