package com.company.TasksLOOPS;

//write a program count the number of digits of the number using while loop

public class fourth {
    public static void main(String[] args) {

        int number = 345;
        int count =0;

        while( number !=0){
            number /=10;//intra in loop, imparte 345la 10,si pe masura ce tot muta virgula, nr ajunge la 0
            ++count;
        }

        System.out.println(count);
    }
}
