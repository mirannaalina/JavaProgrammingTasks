package com.company.CallREFandCallVAL;

public class CallREF {

    int x;
    public void addition(CallREF hey){
        x= hey.x+5;//10 +5
        System.out.println(hey.x + x); //15 +15
    }

    public static void main(String[] args) {
        CallREF call = new CallREF();
        call.x =10;

        call.addition(call);
        System.out.println(call.x);
    }
}
