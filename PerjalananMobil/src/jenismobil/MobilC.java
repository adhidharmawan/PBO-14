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
public class MobilC extends AbstractMobil{
    public double jarak;
    public double kecepatan;
    
    public double hitungBahanBakar(){
        double bahan = jarak / 12;
        return bahan;
    }
    
    public double hitungJam(){
        double jam = jarak / kecepatan;
        return jam;
    }
}
