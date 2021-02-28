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
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Act. 4 -----------------------------------------------------------------
        /*double x = 5.0;
        double y = 2.0;
        
        computePercent porcentaje = new computePercent();
        double res = porcentaje.porcentaje(y, x);
        double reverse = porcentaje.porcentaje(x, y);
        System.out.println("Act. 4 inciso a");
        System.out.println("Porcentaje: " + res + "%\nReversa: " + reverse + "%");
        System.out.println("\nAct. 4 inciso b");
        System.out.println("Introduce el primer valor: ");
        double n1 = sc.nextDouble();
        System.out.println("Introduce el segundo valor: ");
        double n2 = sc.nextDouble();
        System.out.println("Con los nuevos datos que ingresaste: ");
        double ressc = porcentaje.porcentaje(n1, n2);
        System.out.println("Porcentaje: " + ressc);*/
        
        //Act. 7 -----------------------------------------------------------------
        /*System.out.println("Dame el largo: ");
        double largo = sc.nextDouble();
        System.out.println("\nDame el ancho: ");
        double ancho = sc.nextDouble();
        System.out.println("\nDame el alto: ");
        double alto = sc.nextDouble();
        paintCalculator pc = new paintCalculator();
        double area = pc.calcularArea(largo, ancho, alto);
        double galon = pc.calcularGalones(area);
        double precio = pc.calcularGasto(galon);
        System.out.println("El área total es: " + area);
        System.out.println("Los galones totales son: " + galon);
        System.out.println("El precio total es : " + precio);*/
        
        //Act. 10 -----------------------------------------------------------------
        /*interest precio = new interest();
        System.out.println("Ingresa cantidad inicial de tu cuenta: ");
        double valor = sc.nextDouble();
        System.out.println("Tu cuenta al final del año tiene: " + precio.porcentaje(valor));*/
        
        //Act. 13 -----------------------------------------------------------------
        /*BankAccount [] cuentas = new BankAccount[4];
        cuentas[0] = TestBankAccount.getData();
        cuentas[1] = TestBankAccount.getData();        
        cuentas[2] = TestBankAccount.getData();
        cuentas[3] = new BankAccount();
        for(int i=0; i<cuentas.length; i++){
            cuentas[i].imprimir();
        }*/
    }
}
