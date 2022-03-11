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
public class BankBeraksi {
    public static void main(String[]args){
        Bank rekening = new Bank();
        rekening.simpanUang(500000);
        rekening.getSaldo();
        rekening.ambilSaldo(150000);
        rekening.getSaldo();
    }
}
