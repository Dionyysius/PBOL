/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JFileChooser;

/**
 *
 * @author ACER
 */
public class latihan3a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       FileInputStream inStream = null;

        JFileChooser chooser = new JFileChooser();
         int hasil = chooser.showOpenDialog(null);
        File inFile = null;

        if (hasil == JFileChooser.APPROVE_OPTION) {
            inFile = chooser.getSelectedFile();

        }
      
            if (inFile != null) {
            try {
                inStream = new FileInputStream(inFile);
                int fileSize = (int) inFile.length();
                byte[] byteArray = new byte[fileSize];
                inStream.read(byteArray);
                for (int i = 0; i < fileSize; i++) {
                    System.out.print((char) byteArray[i]);
                }
                inStream.close();
            } catch (FileNotFoundException ex) {
                System.out.println(ex.getMessage());
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        }
    }

