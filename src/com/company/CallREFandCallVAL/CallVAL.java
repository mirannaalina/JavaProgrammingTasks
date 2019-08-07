package com.company.CallREFandCallVAL;

public class CallVAL {
    int x;

    public void addition(int hey){
        x=hey+5;
        System.out.println(x);
    }

    public static void main(String[] args) {
        CallVAL cal = new CallVAL();
        cal.addition(10);
        System.out.println(cal.x);
    }
}
