package com.company.TasksLOOPS;

//write a program to get a number from the user and print whether it is positive or negative

import java.util.*;

public class first {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("choose a number :");
        int number = sc.nextInt();

        if(number<0){
            System.out.println("ai ales un nr negativ");
        }else{
            System.out.println("nr e pozitiv");
        }


    }
}
