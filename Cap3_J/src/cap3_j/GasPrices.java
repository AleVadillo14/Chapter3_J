/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap3_j;

/**
 *
 * @author ALEW
 */
public class GasPrices {
    final static float MIN_PRICE = 0.035f; 
   final static float MAX_PRICE = 0.04f; 
   
   public static void pricesPerGallon(Integer price_barrel){
       float min = price_barrel*MIN_PRICE;
       float max = price_barrel*MAX_PRICE;
       System.out.println(String.format("Price per gallon between $%.2f - $%.2f",min,max));
       
   }
}
