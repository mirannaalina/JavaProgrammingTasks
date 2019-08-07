package com.company.TasksARRAYS;

//write a java program to calculate average of values of an array

public class second {

    public static void main(String[] args) {
        int [] no = {3,2,4,5,9,8};

        int total = 0;

        for(int i=0;i<no.length;i++){
            total=total+no[i];
        }

        int average = total / no.length; //imparti suma la numarul array-ului
        System.out.println(average);



    }
}
