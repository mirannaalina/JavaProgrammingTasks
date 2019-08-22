package com.company.LAMBDA.Test4;

public class LambdaExpressionExample4 {

    public static void main(String[] args) {

        Sayable s1 = (names) -> {  return "HEllo" + names; };

        System.out.println(s1.say("d"));

        Sayable s2 = (names) -> { return "Hello" + names; };

        System.out.println(s2.say("d"));
    }
}
