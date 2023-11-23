/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_pemrograman2;
import java.util.Scanner;
/**
 *
 * @author lenovo
 */
public class Mandiri extends Bank{
    
    @Override
    public void Menampilkan(){
        Scanner in = new Scanner (System.in);
        System.out.println("Nama Bank    : ");
        String Nama = in.nextLine();
        System.out.println("Nama Nasabah : ");
        String nAma = in.nextLine();
        System.out.println("Saldo        : "+ Saldo);
        
        
    }
    public int ambilSaldo(){
        return Saldo;
        
    }
    
}
