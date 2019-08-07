package com.company.AccessModif;

import java.util.ArrayList;

public class Account {

    //variabilele
    private String acoName;
    private String test1;
    private String test2;
    private String test3;
    private int balance= 0;
    private ArrayList<Integer> transactions; //array de tranzactii

    //constructor
    public Account (String test){
        this.acoName = test;
        this.transactions = new ArrayList<Integer>();
    }
    public Account (String test1 , String test2){
        this.test1 = test1;
        this.test2 = test2;
    }
    public Account( String test1 , String test2, String test3){
        this.test1 = test1;
        this.test2 = test2;
        this.test3 = test3;
    }

    public int getBalance(){
        return balance;
    }

    public void deposit( int amount) {//metoda ce are un int ca parametru
        if (amount > 0) { //daca suma e mai mare de 0
            transactions.add(amount);// array de tranzactii, adauga o suma
            this.balance += amount; // balance =0 + amound-ul pus


            //printeaza balance si cat ai adaugat.
            System.out.println(amount + " adaugati. Balance acum :" + this.balance);
        } else {
            System.out.println("esti sarac");
        }
    }

    public void withdraw ( int amount){
        int withdraw = -amount;
        if (withdraw <0){
            this.transactions.add(withdraw);
            this.balance += withdraw;
            System.out.println("ai scos , mai ai in cont : "+ this.balance);
        }
    }
    public void calculateBalance(){
        this.balance=0;

        for(int i : this.transactions){
            this.balance+=i;
        }
        System.out.println("Calculated balance is "+ this.transactions);
    }
}
