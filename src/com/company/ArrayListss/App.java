package com.company.ArrayListss;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> inte = new ArrayList<>();

        //adding items in array
        inte.add(4);
        inte.add(8);

        //adding lots of items in the array using for loop
        for(int i=0;i<10;i++){
            inte.add(i);
            System.out.println(inte);
        }

        System.out.println("------------------------------------------");
        //getting the number of position 1(in this case)
        System.out.println(inte.get(1));

        System.out.println("-------------------------------------------");
        //shows the array
        for(int i=0;i<inte.size();i++){
            System.out.println(inte.get(i));
        }
        System.out.println("-------------------------------------------");
        //removing items

        inte.remove(inte.size()-1);
        //or
        inte.remove(0);
        System.out.println("--------------------------------------------");

        for(Integer inss : inte){
            System.out.println(inss);
        }
        System.out.println("---------------------------------------------");

        List<String> val = new ArrayList<>();

        val.add("hey");
        val.add("mai");
        System.out.println(val.size());
        System.out.println(val.isEmpty());
        System.out.println(val);
        val.remove(1);
        System.out.println(val);
    }
}
