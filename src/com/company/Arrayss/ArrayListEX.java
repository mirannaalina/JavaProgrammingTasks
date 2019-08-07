package com.company.Arrayss;

import java.util.ArrayList;

class IntClass{
    private int Myvalue;

    public IntClass(int Myvalue){
        this.Myvalue = Myvalue;
    }

    public int getValue(){
        return Myvalue;
    }

}

public class ArrayListEX {

    public static void main(String[] args) {

        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArraylist = new ArrayList<>();
        strArraylist.add("t");


        ArrayList<IntClass> intClassArrayList =  new ArrayList<>();
        intClassArrayList.add(new IntClass(50));


        Integer integer = new Integer(20);

        Double doubleval = new Double(12.9);

        ArrayList<Integer>  intArrayList = new ArrayList<>();
        for(int i =0; i<=10;i++){
            intArrayList.add(Integer.valueOf(i));
            System.out.println(intArrayList);
        }

        for(int i=0; i<=10;i++){
            System.out.println(i +intArrayList.get(i).intValue());//face adunarea i + valoare
        }

        System.out.println("test");
        ArrayList<Double> mydoublevalues = new ArrayList<>();
        for (double db =0.0; db <10.0; db +=05){
            mydoublevalues.add(db);
            System.out.println(mydoublevalues);
        }

    }
}
