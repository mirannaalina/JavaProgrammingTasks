package com.company.Files;

import java.io.*;

public class ReadWrite {
    public static void main(String[] args) {

        ReadWrite s = new ReadWrite();
        System.out.println("Fisierul inainte de modificare : ");
        s.ReadFile();
        System.out.println("----------------------------------");
        s.WriteFile();
        System.out.println("fisierul modificat : ");
        s.ReadFile();


    }

    public void ReadFile(){
        try(BufferedReader bf = new BufferedReader(new FileReader("C:/Users/A737860/Desktop/h.txt"))){
            String current;

            while((current= bf.readLine()) != null){
                System.out.println(current);
            }
        }catch (IOException s){
            s.printStackTrace();
        }
    }
    public static void WriteFile(){
        try{
            String data = "ceva";//string de bagat in fisier
            File f = new File("C:/Users/A737860/Desktop/h.txt"); //creaza obiectul fisier cu path
            FileWriter fw = new FileWriter(f); //obiect filewriter
            BufferedWriter bw = new BufferedWriter(fw); //obiect buffer
            bw.write(data);
            bw.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
