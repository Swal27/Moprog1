/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author Dzulfikar S.A
 */
public class Bank {
    private int saldo;
    public Bank(){
        saldo = 100000;
        System.out.println("Selamat Data di Bank Budi Luhur");
        System.out.println("Saldo saat ini = "+saldo);
    }
    
    public void simpanUang(int a){
        saldo = saldo + a;
        System.out.println("Simpan uang = "+a);
    }
    
    public void getSaldo(){
        System.out.println("Saldo saat ini = "+saldo);
    }
    
    public void ambilSaldo(int a){
        saldo = saldo - a;
        System.out.println("Ambil Uang = "+a);
    }
}
