package com.company.LAMBDA;

public class Test {

    public static void main(String[] args) {
        FuncInterface fobj = (int r, int c) -> System.out.println(2 +r + c);
        fobj.normalFun();
        fobj.abstractFun(2, 3);


    }
}
