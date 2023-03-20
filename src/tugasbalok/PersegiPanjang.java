/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasbalok;

/**
 *
 * @author LENOVO
 */
public class PersegiPanjang {
    private double panjang, lebar, luas, keliling;
    public PersegiPanjang(double p, double l){
        panjang = p;
        lebar = l;
    }
    
    // Encaptulation
    public void setPanjang(int p){
        panjang = p;
    }
    
    public double getPanjang(){
        return panjang;
    }
    
    public void setLebar(int l){
        lebar = l;
    }
    
    public double getLebar(){
        return lebar;
    }

    public double hitungLuas() {
        luas =  panjang * lebar;
        return luas;
    }

    public double hitungKeliling() {
        keliling = 2 *(panjang + lebar);
        return keliling;
    }
    
    public double getLuas(){
        return luas;
    }
    
    public double getKeliling(){
        return keliling;
    }
}
