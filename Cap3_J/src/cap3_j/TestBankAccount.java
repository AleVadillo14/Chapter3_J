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
public class TestBankAccount {
    public static BankAccount getData(){
        BankAccount cuenta = new BankAccount();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\nNúmero de cuenta: ");
        cuenta.setNumCuenta(sc.nextInt());
        System.out.println("Dueño de la cuenta: ");
        cuenta.setNombre(sc.next());
        System.out.println("Balance de cuenta: ");
        cuenta.setBalance(sc.nextDouble());
        return cuenta;
    }
}
