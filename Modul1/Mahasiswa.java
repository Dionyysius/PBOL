/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul1;

/**
 *
 * @author ACER
 */
public class Mahasiswa extends Penduduk implements Peserta {
    private String nim;

    public Mahasiswa() {
    }

    @Override
    public String getJenisSertifikat() {
        String jenisSertifikat ="Sertifikat Panitia";
        return jenisSertifikat;
    }

    @Override
    public String getFasilitas() {
       String fasilitas="Block Note, Alat tulis,Laptop"; 
       return fasilitas;
    }

    @Override
    public String getKonsumsi() {
        String konsumsi ="Snack,Makan Siang, Makan Malam";
        return konsumsi;
    }

    @Override
    public double hitungIuran() {
       double iuran = Double.parseDouble(nim);
       return iuran/10000;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
    
    
    
    
    
    
}
