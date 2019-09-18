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
public abstract class Karyawan extends Manusia {

    private int gaji, jamKerja, pajak;
    private String seragam, desc;

    public String getDesc() {
        return desc;
    }

    protected void setDesc(String desc) {
        this.desc = desc;
    }

    
    public int getGaji() {
        return gaji;
    }

    protected void setGaji(int gaji) {
        this.gaji = gaji;
    }

    public int getJamKerja() {
        return jamKerja;
    }

    protected void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public int getPajak() {
        return pajak;
    }

    protected void setPajak(int pajak) {
        this.pajak = pajak;
    }

    public String getSeragam() {
        return seragam;
    }

    protected void setSeragam(String seragam) {
        this.seragam = seragam;
    }

    
    public int bayarPajak(){
        return pajak * gaji / 100;
    }
    
    public void jobDesc(){
        System.out.println("" + getNama() + " dengan alamat " + getAlamat()  + " " + getDesc() );
    }
}
