package com.company.TasksLOOPS;

import java.util.*;

//write a program to display the multiplication table of a given integer using for loops

public class third {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Give me a number to multiple");

        int number = sc.nextInt();

        for (int i =1; i<10;i++){
            int multiplication = number * i;
            System.out.println(number +" X " + i + " =" +multiplication);
        }
    }
}
