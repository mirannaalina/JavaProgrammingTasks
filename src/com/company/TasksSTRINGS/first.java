package com.company.TasksSTRINGS;

//write a java program to compare two strings, ignoring case differences

public class first {

    public static void main(String[] args) {

        String s= "hey";
        String r="heY";

        if(s.compareToIgnoreCase(r) ==0){//ignore case, le compara chiar daca sunt cu litere mari sau nu
            System.out.println("true");
        }

    }
}
