/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author ACER
 */
public class outfile {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File outFile = new File("sampel.data");

        FileOutputStream outStream = new FileOutputStream(outFile);
        byte[] byteArray = {10, 20, 30, 40,
            50, 60, 70, 80};

//write data to the stream
        outStream.write(byteArray);

//output done, so close the stream
        outStream.close();

    }

}
