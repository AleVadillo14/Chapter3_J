/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap3_j;

import java.util.Scanner;

/**
 *
 * @author ALEW
 */
public class ArithmeticMethods2 {
    private Integer a;
    private Integer b;

    public ArithmeticMethods2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresar primer número:");
        this.a = scanner.nextInt();
        System.out.print("Ingresar segundo número:");
        this.b = scanner.nextInt();
    }

    public Integer getA() {
        return a;
    }

    public Integer getB() {
        return b;
    }
    
    
    
     public static void displayNumberPlus10 (Integer a){
        System.out.println(a+10);
    }
    
    public static void displayNumberPlus100 (Integer a){
        System.out.println(a+100);
    }
    
    public static void displayNumberPlus1000 (Integer a){
        System.out.println(a+1000);
    }
}
