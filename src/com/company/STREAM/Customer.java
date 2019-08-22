package com.company.STREAM;

public class Customer {
    private String name;
    private int points;

    public Customer(String name, int points){
        this.name = name;
        this.points= points;
    }

    public String getName(){
        return name;
    }
    public int getPoints(){
        return points;
    }
}
