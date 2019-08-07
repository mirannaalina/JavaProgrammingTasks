package com.company.Files;

import java.io.File;
import java.io.IOException;

public class Exists {

    public static void main(String[] args) {
        try{
            File f = new File("C:\\Users\\A737860\\Desktop\\j.txt");

            if(f.createNewFile()){
                System.out.println("succes");
            }else{
                System.out.println("failed");
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
