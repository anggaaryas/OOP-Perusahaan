/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perusahaan;

/**
 *
 * @author Angga
 */
public class BOS extends Karyawan implements iRapat{
    
    BOS(){
        setSeragam("Jas Hitam");
        setGaji(20000000);
        setJamKerja(8);
        setPajak(20);
        setDesc("Mengawasi jalannya perusahaan");
    }

    @Override
    public void tempadDuduk() {
        System.out.println("Dapat Tempat duduk sofa");
    }

    @Override
    public void snack() {
        System.out.println("Dapat Pizzaa hut");
    }
    
    
}
