package com.company.LAMBDA;

public interface FuncInterface {
    void abstractFun(int x, int c);

    default void normalFun(){
        System.out.println("h");
    }
}
