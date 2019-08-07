package com.company.TasksARRAYS;

import java.util.stream.IntStream;

//write a java program to calculate sum values of an array
public class first {

    public static void main(String[] args) {
        int[] num1 = new int[]{3,5,8,9};

        int sum = IntStream.of(num1).sum();
        System.out.println(sum);
    }

    //sau

    public static void sum(){

        int total =0;
        int[] num1 = new int[]{3,5,8,9};

        for(int i=0;i<num1.length;i++){
            total = total + num1[i];
        }

    }
}
