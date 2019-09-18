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
public class Perusahaan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BOS angga = new BOS();
        
        angga.setNama("Angga Arya S");
        angga.setJenisKelamin("Laki Laki");
        angga.setAlamat("Sleman");
        
        angga.jobDesc();
    }
    
}
