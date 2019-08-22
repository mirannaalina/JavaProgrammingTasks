package com.company.LAMBDA.Test7;

public class LambdaExpressionExample8 {

    public static void main(String[] args) {
        Sayable per = (message) -> { String st1 = "I would like to say";
                                     String st2 = st1 +message;
                                     return st2;};

        System.out.println(per.say(" Alina"));

    }
}
