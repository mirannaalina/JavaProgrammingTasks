package com.company.Files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class files {

    public static void main(String[] args) {


        try {

            String date = "Het";

            File f = new File("C:/Users/A737860/"+"/Desktop/h.txt");

            if(!f.exists()){
                f.createNewFile();
            }

            FileWriter fw = new FileWriter(f.getAbsoluteFile(), true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(date);
            bw.close();
        } catch (
                IOException e) {
            e.printStackTrace();
        }

    }
}
