package com.company.LAMBDA.Test3;

public class LambdaExpressionExample3 {

    public static void main(String[] args) {

        Sayable s =() -> {
            return "nothing" ; //e ca si cum e o metoda cu body, cand o apelezi se comporta identic.
        };
        System.out.println(s.say());
    }
}
