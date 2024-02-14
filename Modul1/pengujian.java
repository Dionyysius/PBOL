/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul1;

/**
 *
 * @author ACER
 */
public class pengujian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       UKM ukm = new UKM();
       ukm.setNamaUnit("Pelatihan Internet");
        double total = 0;
       Mahasiswa ketua = new Mahasiswa();
       ketua.setNama("Edo");
       ketua.setNim("225314001");
       ukm.setKetua(ketua);
       
       Mahasiswa sekretaris = new Mahasiswa();
       sekretaris.setNama("Atma");
       sekretaris.setNim("225314002");
       ukm.setSekretaris(sekretaris);
       
//       Penduduk[] anggota = new Penduduk[10];
//       anggota[0]=new Masyarakat();
//       anggota[0].setNama("Aji");
//       anggota[0].setTanggalLahir("22 january 1945");
//       anggota[0].setNomor();
       
       
       Masyarakat[] ms = new Masyarakat[3];
       Mahasiswa[] mhs = new Mahasiswa[3];
        for (int i = 0; i < 3; i++) {
            ms[i]=new Masyarakat();
            mhs[i]=new Mahasiswa();
            
        }
       ms[0].setNama("Aji");
       ms[0].setTanggalLahir("22 january 1945");
       ms[0].setNomor("101");
      
       ms[1].setNama("Bayu");
       ms[1].setTanggalLahir("22 january 1945");
       ms[1].setNomor("202");
      
       Mahasiswa mhs0 = new Mahasiswa();
       mhs[0].setNama("Vandi");
       mhs[0].setNim("225314003");
       mhs[0].setTanggalLahir("13 juni 1946");
       
       
       
       Penduduk[] anggota={ketua,sekretaris,ms[0],ms[1],mhs[0]};
       ukm.setAnggota(anggota);
       
        for (int i = 2; i < ukm.getAnggota().length; i++) {
           
             total += anggota[i].hitungIuran();
            
        }
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
        System.out.println("Nama UKM :                    "+ukm.getNamaUnit());
        System.out.println("Nama Ketua :                  "+ukm.getKetua().getNama());
        System.out.println("Nama Sekretaris :             "+ukm.getSekretaris().getNama());
        System.out.println("DAFTAR Anggota");
        System.out.println("====================================================================================================================================================================");
        System.out.println("No.  Nama         Iuran r              Sertifikat              Fasilitas                               Konsumsi");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < ukm.getAnggota().length ; i++) {
            if (i==0) {
            System.out.printf("%-5s",i+1);
            System.out.printf("%-13s",anggota[i].getNama());
            System.out.printf("%-20s","----");
            System.out.printf("%-24s",ukm.getKetua().getJenisSertifikat());
            System.out.printf("%-40s",ukm.getKetua().getFasilitas());
            System.out.printf("%-20s",ukm.getKetua().getKonsumsi());
                System.out.println();
            
            }else if(i==1){
                System.out.printf("%-5s",i+1);
                System.out.printf("%-13s",anggota[i].getNama());
                System.out.printf("%-20s","----");
                System.out.printf("%-24s",ukm.getSekretaris().getJenisSertifikat());
                System.out.printf("%-40s",ukm.getSekretaris().getFasilitas());
                System.out.printf("%-20s",ukm.getSekretaris().getKonsumsi());
                System.out.println();
            }else{ 
                System.out.printf("%-5s",i+1);
                System.out.printf("%-13s",anggota[i].getNama());
                System.out.printf("%-20s",anggota[i].hitungIuran());
                if (ukm.getAnggota()[i] instanceof Masyarakat) {
                    System.out.printf("%-24s",((Masyarakat)ukm.getAnggota()[i]).getJenisSertifikat());
                    System.out.printf("%-40s",((Masyarakat)ukm.getAnggota()[i]).getFasilitas());
                    System.out.printf("%-20s",((Masyarakat)ukm.getAnggota()[i]).getKonsumsi());
                    System.out.println();
                    
                }else if (ukm.getAnggota()[i] instanceof Mahasiswa) {
                    System.out.printf("%-24s",((Mahasiswa)ukm.getAnggota()[i]).getJenisSertifikat());
                    System.out.printf("%-40s",((Mahasiswa)ukm.getAnggota()[i]).getFasilitas());
                    System.out.printf("%-20s",((Mahasiswa)ukm.getAnggota()[i]).getKonsumsi());
                    System.out.println();
                    
                }
            
            
            }
           
          
           
            
        }
         System.out.println("====================================================================================================================================================================");
        System.out.println("Total Iuran = "+total);
        
        
       
       
       
       
       
       
       
       
       
        
    }
    
}
