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
public class MetricConversion {
    public static final float INCH_TO_CENT = 2.54f;
    public static final float GAL_TO_LIT = 3.7854f;
    
    public static void inchesToCentimeters(Integer date){
        System.out.println(date+" pulgadas es igual a "+date*INCH_TO_CENT+" centimetros");
    }
    
    public static void gallonsToLiters(Integer date){
        System.out.println(date+" gallones es igual a "+date*GAL_TO_LIT+" litros");
    }
}
