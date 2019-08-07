package com.company.TasksLOOPS;

//write a program to check numb is palindrome or not using while loop
//the same after reverse
public class sixth {
    public static void main(String[] args) {

        int number = 121;

        int r,sum=0,temp;
        temp =number;

        while(number>0){
            r=number%10;
            sum = (sum *10) + r;
            number =number /10;
        }
        if(temp==sum){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }

    }
}
