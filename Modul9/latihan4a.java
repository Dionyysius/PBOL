/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFileChooser;

/**
 *
 * @author ACER
 */
public class latihan4a {

     public static void main(String[] args) {
        // TODO code application logic here
        FileOutputStream outStream = null;
        JFileChooser chooser = new JFileChooser();
        int status = chooser.showSaveDialog(null);
        
        
        if (status == JFileChooser.APPROVE_OPTION) {
            File outFile = chooser.getSelectedFile();
            
        
        try{
            outStream = new FileOutputStream(outFile);
            Scanner sc = new Scanner(System.in);
            System.out.println("Masukan Pesan yang anda inggin simpan : ");
            String info = sc.nextLine();
            outStream.write(info.getBytes());
            outStream.close();
        
        }catch(FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }catch(IOException ex ){
            System.out.println(ex.getMessage());
        
        }
    }
        
    }
    
    
}
