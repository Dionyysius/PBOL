/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul1;

/**
 *
 * @author ACER
 */
public class Masyarakat extends Penduduk implements Peserta {
   private String nomor;

    public Masyarakat() {
    }

    public String getNomor() {
        return nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    @Override
    public String getJenisSertifikat() {
       String sertifikat = "Sertifikat Peserta";
        return sertifikat;
    }

    @Override
    public String getFasilitas() {
       String fasilitas = "Block note,alat tulis, modul pelatihan";
       return fasilitas;
    }
 
    @Override
    public String getKonsumsi() {
        String konsumsi = "Snack, Makan Siang";
        return konsumsi;
    }

    @Override
    public double hitungIuran() {
       String huruf=nomor.substring(0, 2);
       return Double.parseDouble(huruf)*100;
    }

   
    
    
    
}
