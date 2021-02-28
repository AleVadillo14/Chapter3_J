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
public class paintCalculator {
    public double calcularArea(double l, double an, double al){
        double a1 = l*al*2;
        double a2 = an*al*2;
        double at = a1 + a2;
        return at;
    }
    
    public double calcularGalones(double at){
        double gt = at/350;
        return gt;
    }
    
    public double calcularGasto(double gt){
        double pt = gt*32;
        return pt;
    }
}
