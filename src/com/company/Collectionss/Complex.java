package com.company.Collectionss;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Complex {

    public static String[] masini  = {"ambulanta ","elicopter","barca"};// o lista de masini

    public static String[][] soferi = {{"Fred","Stu","Sec","Bob","Mic","Cry"},{"gimi","choo","grei","movi"}, { "Pete", "Mary", "Bob" }};

    public static void main(String[] args) {

        Map<String, Set<String>> persoane = new HashMap<>();//am creat o lista de tip (cheie-valoare)

        for(int i =0; i<masini.length ;i++){ //parcurge lista de masini
            String masina = masini[i]; //variabila ce tine fiecare masina
            String[] ListadeSoferi = soferi[i];//lista ce tine fiecare sofer

            Set<String> seteazaSofer = new LinkedHashSet<>();
            for(String sofer : ListadeSoferi){
                seteazaSofer.add(sofer);//parcurge toata lista si adauga un sofer din lista de soferi
            }
            persoane.put(masina,seteazaSofer);
        }

        System.out.println(persoane);

    }

}
