/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author ACER
 */
public class infile {

    public static void main(String[] args) throws  IOException {
        File inFile = new File("sampel.data");
        FileInputStream inStream = new FileInputStream(inFile);

//set up an array to read data in
        int fileSize = (int) inFile.length();
        byte[] byteArray = new byte[fileSize];

//read data in and display them
        inStream.read(byteArray);
        for (int i = 0; i < fileSize; i++) {
            System.out.println(byteArray[i]);
        }

//input done, so close the stream
        inStream.close();
    }
}
