package com.company.LAMBDA;

import java.util.ArrayList;

public class T {
    public static void main(String[] args) {


        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.add(4);

        ar.forEach(y -> System.out.println(y));

        System.out.println("----------------------");
        ar.forEach(n -> { if (n%2 ==0) System.out.println(n);});

        System.out.println("-----------------------");
        ar.forEach(y -> { if (y%2 == 1) System.out.println(y);});

        System.out.println("-----------------------");
        ar.forEach(f -> { if (f/2 ==0) System.out.println(f);});

    }
}
