/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hp;

/**
 *
 * @author Dzulfikar S.A
 */
public class HandphoneBeraksi {
    public static void main(String[]args){
        Handphone hp = new Handphone();
        
        hp.Hidupkan();
        hp.KirimSms();
        hp.LakukanPanggilan();
        hp.Matikan();
    }
}
