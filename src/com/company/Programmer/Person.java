package com.company.Programmer;

public class Person implements Comparable<Person>{ //comparable interface must to override compareTo method!

    private final String name;


    //constr  (person with a name)
    public Person(String name){
        this.name = name;
    }

    public int compareTo(Person p) {
        return name.compareTo(p.name);
    }


}
