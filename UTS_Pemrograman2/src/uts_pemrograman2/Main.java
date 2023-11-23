/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts_pemrograman2;
import java.util.Scanner;
/**
 *
 * @author lenovo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Bank B = new Bank();
        B.Menampilkan();
        B.Simpan(50000000);
                
        ATM A = new ATM();
        Scanner in = new Scanner (System.in);
        
        A.SetUsername(in.nextLine());
        A.SetPassword(in.nextLine());
        A.SetSaldo(in.nextInt());
        System.out.println("Username = " + A.GetUsername());
        System.out.println("Password = " + A.GetPassword());
        System.out.println("Saldo    = " + A.GetSaldo());
        
        BRI R = new BRI();
        R.namaBank = " ";
        String namaBank = in.nextLine();
        R.namaNasabah = " ";
        String namaNasabah = in.nextLine();
        R.Saldo = 50000000 ;
        R.Menampilkan();
        R.Nabung(8700000);
        
        BNI N = new BNI();
        N.namaBank = " ";
        String nama = in.nextLine();
        N.namaNasabah = " ";
        String namaN = in.nextLine();
        N.Saldo = 50000000;
        N.Menampilkan();
        N.ambilUang(4530000);
        
        Mandiri M = new Mandiri();
        M.namaBank = " ";
        String Nama = in.nextLine();
        M.namaNasabah = " ";
        String nAma = in.nextLine();
        M.Saldo = 50000000;
        M.Menampilkan();
        M.ambilSaldo();
        
        BTN T = new BTN();
        T.namaBank =" ";
        String naMa = in.nextLine();
        T.namaNasabah =" ";
        String namA = in.nextLine();
        T.Saldo = 50000000;
        T.Menampilkan();
        T.setSaldo(75500000);
    }
    
}
