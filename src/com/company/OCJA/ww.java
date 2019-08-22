package com.company.OCJA;

public class ww {

    public static void main(String[] args) {
        String s1="java";

        String s2 =new String("java");

        s1 =s2;

        if(s1==s2){
            System.out.println("equals");
        }else{
            System.out.println("no");
        }
    }
}
