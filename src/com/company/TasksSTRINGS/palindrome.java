package com.company.TasksSTRINGS;

//write a program to check a string if is palindrome or not.
//palindrome = reversul lui e la fel ca originalul
public class palindrome {

    public static void main(String[] args) {
        String strToReverse ="MOMy";

         StringBuilder str = new StringBuilder(strToReverse).reverse();

         String strre = str.toString();

        if(strToReverse.equalsIgnoreCase(strre)) {
            System.out.println(strre);
        }else {
            System.out.println(strToReverse +" is not a polindrome");
        }

    }
}
