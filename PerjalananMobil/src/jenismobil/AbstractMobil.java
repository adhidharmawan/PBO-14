/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jenismobil;

/**
 *
 * @author User
 */
public abstract class AbstractMobil {
    public abstract double hitungBahanBakar();
    public abstract double hitungJam();
    public void tampilHasil(){
        System.out.println("Bahan Bakar Minimalnya: "+String.format("%.2f",this.hitungBahanBakar())+" liter");
        System.out.println("Lama Waktu Perjalanan: "+String.format("%.2f",this.hitungJam())+(" jam"));
    }
}
