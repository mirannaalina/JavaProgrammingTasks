package com.company.TasksSTRINGS;

//write a program to count number of time a character repeated in a string

public class seventh {

    public static void main(String[] args) {

        String co = " Hey Alina a";

        int count =0; //variabila ce tine duplicatele

        char[] inp = co.toCharArray(); //metoda ce transforma stringu meu in array de caractere

        for(int i=0; i<co.length();i++){
            for(int j =i+1; j<co.length();j++){
                if(inp[i] ==inp[j]){
                    System.out.println(inp[j]);
                    count++; // daca dupa ce se compara i cu j este vreun duplicat, afiseaza-l si salveaza nr de duplicate
                    break;
                }
            }
        }


    }
}
