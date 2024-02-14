/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author ACER
 */
public class tes1 {
    public static void main(String[] args) throws  IOException {
                File file = new File("sampe2.data"); // Ganti dengan path file Anda
                FileReader fileReader = new FileReader(file);
                BufferedReader bufReader = new BufferedReader(fileReader);
                String str;
                str = bufReader.readLine();
                int i = Integer.parseInt(str);

	//similar process for other data types

	bufReader.close();

               

    }
}
