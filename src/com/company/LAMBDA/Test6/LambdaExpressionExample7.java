package com.company.LAMBDA.Test6;


import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionExample7 {

    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();

        ls.add("h");
        ls.add("sd");
        ls.add("q");

        ls.forEach ((n) -> System.out.println(n));
    }
}
