package com.company.Programmer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SortCheck {

    private static final String[] NAMES = {
            "John", "Paul", "Sarah", "Anton", "Antonia", "Peter", "Heinz",
            "Kiriaki", "Kirk", "Maurice", "Simone", "Vuyisile", "Prakash",
            "Yen", "Michelle", "Rabea", "Steve", "Patrick", "Alvaro", "Petros",
            "Charalambos", "Susie", "Rebekka", "Zoran", "Quinton", "Sean"
    };

    private static final int numberOfPersons =10;

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        for(int i =0; i < numberOfPersons;i++){
            persons.add(generate()); //creaza 10 obiecte persoane si atribuie (persoane-programatori in metoda generate)
        }
    }

    private static final Random RANDOM = new Random();


    private static Person generate(){

        String name = NAMES[RANDOM.nextInt(NAMES.length)];//in variabila name sunt stocate numele random din array-ul NAMES

        if(RANDOM.nextBoolean()){// intra in if si ia random ori persoana ori programmer
            return new Person(name);
        }else {
            return new Programmer(name,(short) (RANDOM.nextInt(80)+120));//daca alege programmer, el are si un int de iq(more than120)
        }
    }
}
