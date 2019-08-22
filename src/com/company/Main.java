package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(2+3 +"hey"); //face adunarea dupa afiseaza stringul

        System.out.println("hey" + 2+4); //afiseaza stringul si dupa afiseaza 2 si 4

        System.out.println("hey"+ (4+3)); //ca sa faca suma dupa string, trb pus in paranteza

        Alina s  = new Alina();

        System.out.println(s.getClass());
    }
}
