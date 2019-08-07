package com.company.TasksSTRINGS;

//write a program to revers a string

public class sixth {

    public static void main(String[] args) {

        String c = "raecloc";

        StringBuilder st = new StringBuilder();

        st.append(c);  //lipim stringul normal la builder

        st = st.reverse();  //dupa apelam metoda de reverse
        System.out.println(st);

    }
}

