package com.company.LAMBDA.Test9;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaExpressionExample10 {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product(1, "HP", 23f));
        list.add(new Product(3, "SD", 2f));
        list.add(new Product(3, "D", 24f));

        System.out.println("sorting");

        // list.forEach ((n) -> System.out.println(n));

        Collections.sort(list,(p1,p2)-> {
            return p1.name.compareTo(p2.name);
        });
        for (Product p :list ){
            System.out.println(p.id + p.name + p.price);
        }
    }

}
