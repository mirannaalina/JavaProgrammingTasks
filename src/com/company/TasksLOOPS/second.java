package com.company.TasksLOOPS;

//write a program to find greatest of 3 numbers

public class second {

    public static void main(String[] args) {

        int num1=5;
        int num2=9;
        int num3=2;

        if( num1>num2 && num1>num3){
            System.out.println("greatest " + num1);
        }else if (num2>num3){
            System.out.println("greatest " + num2);
        }else {
            System.out.println("greatest " + num3);
        }

    }
}
