package com.company.FizzBuzzz;

public class Fizz {

    public static void main(String[] args) {

        System.out.println(fizzz(25));
    }


        public static String fizzz( Integer inte){

        String result = "";
        if(inte % 3 ==0){
            result +="Fizz";
        }
        if (inte % 7 ==0){
            result +="Buzz";
        }
        if (result.equals("")){
            result =inte.toString();
        }

        return result;
    }
}
