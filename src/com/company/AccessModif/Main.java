package com.company.AccessModif;

public class Main {

    public static void main(String[] args) {


        Account ac = new Account("Alina");
        Account ac2 = new Account ( "Alina ", "Ana");
        Account ac3 = new Account ( "Pantea", "Cosmin","Vasile");
        ac.deposit(10);
        ac.withdraw(5);
        ac.withdraw(-4);
        ac.deposit(20);
        ac.calculateBalance();
        //ac2.deposit(30);


        System.out.println("test");
        System.out.println(ac.getBalance());


    }
}
