package com.company.TasksLOOPS;

//write a program to reverse a number using while loop

public class fiveth {

    public static void main(String[] args) {

        int number = 345;
        int reversed =0;

        while(number!=0){
            int digit = number %10;
            reversed = reversed *10 + digit;
            number /=10;
        }
        System.out.println(reversed);
    }
}
