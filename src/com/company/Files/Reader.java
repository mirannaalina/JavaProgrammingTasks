package com.company.Files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {

    public static void main(String[] args) {

        try(BufferedReader buf = new BufferedReader(new FileReader("C:/Users/A737860/Desktop/hosts.txt"))){//creaza un buffer obj, file obj(path)
            String currentline; //variabila ce tine continutul

            while((currentline = buf.readLine())!= null){ // ia continutul si baga-l in variabila, atat timp cat nu e null
                System.out.println(currentline); //afiseaza in consola fiecare linie din fisier.
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
