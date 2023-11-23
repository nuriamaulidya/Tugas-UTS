/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts_pemrograman2;
/**
 *
 * @author lenovo
 */
public class Bank {
    String namaBank;
    String namaNasabah;
    int Saldo;
    
    public void Menampilkan(){
        System.out.println("Menampilkan Nama Bank, Nama Nasabah, dan Saldo");
    }
    
    public void Simpan(int jumlahSimpanan){
        Saldo = Saldo + jumlahSimpanan ;
        System.out.println("Saldo awal : "+"Rp."+ Saldo);
    }
    
}
