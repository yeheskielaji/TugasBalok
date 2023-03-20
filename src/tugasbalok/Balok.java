/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasbalok;

/**
 *
 * @author LENOVO
 */
public class Balok extends PersegiPanjang {
    private double tinggi, hasilVol, hasilLuasP;
    
    public Balok(double p, double l, double t){
        super(p , l);
        tinggi = t;
    }
    
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public double hitungVolume() {
        hasilVol=super.hitungLuas() * tinggi;
        return hasilVol;
    }

    public double hitungLuasP() {
        hasilLuasP = 2 * (super.hitungLuas() + (super.getLebar() * tinggi) + (super.getPanjang() * tinggi));
        return hasilLuasP;
    }
    
    public double gethasilVolume(){
        return hasilVol;
    }
    
    public double gethasilLuasP(){
        return hasilLuasP;
    }
            
}
