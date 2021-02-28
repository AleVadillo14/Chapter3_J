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
public class BankAccount {
    private Integer numCuenta;
    private String nombre;
    private Double balance;
    
    public BankAccount(){
        this.numCuenta = 4400218;
        this.nombre = "Alejandra";
        this.balance = 0.0;
    }

    public Integer getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(Integer numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
    
    public void imprimir(){
        System.out.println("-------------------------------------------");
        System.out.println("El número de cuenta es: " + getNumCuenta());
        System.out.println("El dueño de la cuenta es: " + getNombre());
        System.out.println("El balance de cuenta es: " + getBalance());
    }
    
    public void deductMonthlyFee(){
        this.balance -= 4.00;
    }
    
    public void explainAccountPolicy(){
        System.out.println("The $4 service fee will be deducted each month c:");
    }
}
