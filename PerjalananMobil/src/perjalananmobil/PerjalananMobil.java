/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perjalananmobil;
import jenismobil.*;
/**
 *
 * @author User
 */
public class PerjalananMobil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MobilA ma = new MobilA();
        ma.jarak = 103;
        ma.kecepatan = 60;
        ma.tampilHasil();
        
        MobilB mb = new MobilB();
        mb.jarak =545;
        mb.kecepatan = 65;
        mb.tampilHasil();
        
        MobilC mc = new MobilC();
        mc.jarak = 663;
        mc.kecepatan = 57;
        mc.tampilHasil();
        
        MobilD md = new MobilD();
        md.jarak = 457;
        md.kecepatan = 62;
        md.tampilHasil();
        
        MobilE me = new MobilE();
        me.jarak = 505;
        me.kecepatan = 64;
        me.tampilHasil();
        
        MobilF mf = new MobilF();
        mf.jarak = 411;
        mf.kecepatan = 53;
        mf.tampilHasil();
    }
    
}
