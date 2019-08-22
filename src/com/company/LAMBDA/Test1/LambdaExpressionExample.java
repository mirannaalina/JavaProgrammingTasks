package com.company.LAMBDA.Test1;

public class LambdaExpressionExample {
    public static void main(String[] args) {
        int width=10;


        //fara expresie lambda
        Drawable d = new Drawable() {
            public void draw() {
                System.out.println("draw"+width);
            }
        };

        d.draw();

        //cu expresii lambda

        Drawable d2 = () -> {
            System.out.println("draw"+width);
        };

        d2.draw();





    }
}
