package com.company.TasksARRAYS;

//write a program to check equality of arrays (using for loop, using arrays.equals() method )

import java.util.Arrays;

public class seventh {

    public static void main(String[] args) {
        int [] no1 = { 2,3,4,5};
        int [] no2 = { 2,3,4,5};
       // boolean bol = false;

        for(int i = 0; i <no1.length ; i++){
            if(Arrays.equals(no1,no2)){
                System.out.println("true");
            }
        }

    }
}
