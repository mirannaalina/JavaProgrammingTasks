package com.company.LAMBDA;

public class Test2 {
    interface FuncInter1{
        int operation(int a, int b);
    }

    interface FuncInter2{
        void sayMessage(String message);
    }

    private int operate(int a, int b, FuncInter1 fobj){
        return fobj.operation(a,b);
    }

    public static void main(String[] args) {
        FuncInter1 add = (int x, int y) -> x+y;

        FuncInter1 multiply = (int x, int y) -> x*y;

        Test2 tobj = new Test2();
        System.out.println("addition is " + tobj.operate(3,4,add));
        System.out.println("multiplication is " + tobj.operate(5,3,multiply));
    }
}
