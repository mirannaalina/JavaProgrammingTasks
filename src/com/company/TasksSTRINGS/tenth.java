package com.company.TasksSTRINGS;

//write a program to swap the 3 strings

public class tenth {

    public static void main(String[] args) {

        String original = "abcd"; //string

        char[] c = original.toCharArray(); //face string-ul intr-un array de caractere

        char temp =c[0];//le inverseaza
        c[0] =c[1];
        c[1]= temp;

        String swap = new String(c); //sunt adaugate in noul string

        System.out.println(original); //avem stringul original
        System.out.println(swap); //stringul modificat



    }
}
