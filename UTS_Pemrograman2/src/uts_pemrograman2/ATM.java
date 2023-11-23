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
public class ATM {
    private String username;
    private String password;
    private int saldo;
    
    public void SetUsername(String username){
        this.username = username;
    }
    public void SetPassword(String password){
        this.password = password;
    }
    public void SetSaldo(int saldo){
        this.saldo = saldo;
    }
    
    public String GetUsername(){
        return this.username;
    }
    public String GetPassword(){
        return this.password;
    }
    public int GetSaldo(){
        return this.saldo;
    }
    
}
