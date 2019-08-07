package com.company.FizzBuzzz;

public class DifferentFizz {

    public static void main(String[] args) {

        System.out.println(Fiss(15));
    }

    public static String Fiss(Integer f){
        String result = "";

        if(f % 3 ==0){
            result+="Fizz";
        }else if(f % 5 ==0){// daca pun else if, nu o sa-mi mai intre sa verifice si conditia asta daca e buna. iese direct.
            result+="Buzz";
        }else{
            result = f.toString(); //face rezultatul numeric in string pt ca variabila result e de tip string.
        }


        return result;
    }
}
