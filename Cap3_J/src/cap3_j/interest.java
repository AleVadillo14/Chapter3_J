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
public class interest {
    public double porcentaje(double d){
        return cantFinal(d, d*0.05);
    }
    
    private double cantFinal(double d, double p){
        return d+p;
    }
}
