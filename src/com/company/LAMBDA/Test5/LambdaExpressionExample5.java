package com.company.LAMBDA.Test5;

public class LambdaExpressionExample5 {
    public static void main(String[] args) {

        //without return word
        Addable ad = (a,b) -> (a+b);
        System.out.println(ad.add(3,5));


        //with return word
        Addable ad2 = (c,d) -> { return (c+d);};
        System.out.println(ad2.add(3,3));
    }
}
