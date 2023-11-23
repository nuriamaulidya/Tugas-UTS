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
public class BRI extends Bank {
    
    @Override
    public void Menampilkan(){
        Scanner in = new Scanner(System.in);
        System.out.print("Nama Bank    : ");
        String namaBank = in.nextLine();
        System.out.print("Nama Nasabah : ");
        String namaNasabah = in.nextLine();
        System.out.println("Saldo        : "+ Saldo);
        
        
        
    }
    public void Nabung (int sal){
        Saldo = Saldo + sal;
        System.out.println("Saldo total "+"Rp."+ Saldo);
    }
    
}
