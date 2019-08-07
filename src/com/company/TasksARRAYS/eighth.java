package com.company.TasksARRAYS;

//add two matrices using dimensional array

public class eighth {
    public static void main(String[] args) {

        int[][] tr = {{2,3,4,5},{3,4,5,6}};

        for(int i =0; i< tr.length ;i++){
            for(int f =0; f< tr[i].length ; f++){

                System.out.print(tr[i][f]);
            }
            System.out.println();
        }
    }
}
