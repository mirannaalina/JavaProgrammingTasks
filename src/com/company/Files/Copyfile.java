package com.company.Files;

import java.io.*;

public class Copyfile {

    public static void main(String[] args) {
        FileInputStream ins = null;
        FileOutputStream outs = null;

        try{
            File infile = new File("C:\\Users\\A737860\\Desktop\\j.txt");
            File outfile = new File("C:\\Users\\A737860\\Desktop\\h.txt");

            ins = new FileInputStream(infile);
            outs = new FileOutputStream(outfile);
            byte[] buffer = new byte[1024];
            int length;

            while ((length = ins.read(buffer)) >0){
                outs.write(buffer,0,length);
            }
            ins.close();
            outs.close();
            System.out.println("file copied successful");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
