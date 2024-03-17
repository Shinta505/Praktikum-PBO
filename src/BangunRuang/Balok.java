/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunRuang;

import BangunDatar.*;
/**
 *
 * @author hp
 */
public class Balok extends Persegi implements OperasiBangunRuang {
    private double tinggi;
    
    public Balok(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    // Membuat sebuah method Volume untuk mengimplementasikan interface OperasiBangunDatar
    @Override
    public double Volume() {
        double volume = super.Luas()*tinggi; 
        return volume;
    }
    
    // Membuat sebuah method LuasPermukaan untuk mengimplementasikan interface OperasiBangunDatar
    @Override
    public double LuasPermukaan() {
//      Luas Permukaan Balok = 2 * (Luas alas + Luas sisi tegak)
        double luasPermukaan = 2 * (super.Luas() + (super.Keliling() * tinggi));
        return luasPermukaan;
    }
    
}
