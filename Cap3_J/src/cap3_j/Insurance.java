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
public class Insurance {
    public static void premium(int currently_year,int birth_year){
        int edad = birth_year-currently_year;
        System.out.println("$"+(edad/10+15)*20);
    }
}
