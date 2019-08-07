package com.company.TasksARRAYS;

//write a program count multiples of a number in an array

public class sixth {

    public static void main(String[] args) {

        int [] he = {2,3,4,5};

        for(int i=0; i < he.length; i++) {

            System.out.println(he[i]);

            if ( i % 2  == 0){
                System.out.println("multiple of 2 is :" + he[i]);
            }
        }

    }
}
