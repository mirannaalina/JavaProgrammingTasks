package com.company.TasksCLASSObject;

public class Calculation {

    int t,r,c;

    public Calculation(int t, int r, int c){
        this.t = t;
        this.r = r;
        this.c = c;
    }
    public int getSum(){
        int sum =  t+r+c;
        return sum;
    }

    public static void main(String[] args) {
        Calculation cal = new Calculation(3,4,5);
        System.out.println(cal.getSum());
    }
}
