package com.company.STREAM;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Customer john = new Customer("john",15);
        Customer mari = new Customer("mari",158);
        Customer cris = new Customer("cris",11);
        Customer oscar = new Customer("oscar",35);

        List<Customer> customers = Arrays.asList(john,mari,cris,oscar) ;

        //filtering collections

        List<Customer> customerwithmorethan100points = customers.stream().filter(c -> c.getPoints() >100).collect(Collectors.toList());

       // assertThat(customerwithmorethan100points).hasSize(1);

        // System.out.println(customerwithmorethan100points.get(0));
    }
}
