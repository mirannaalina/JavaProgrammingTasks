package com.company.TasksARRAYS;

//write a program to find greatest and smallest element in an array

public class fifth {

    static int[] ar = {2, 3, 4, 5};

    public static void main(String[] args) {

        System.out.println(greatest());
        System.out.println(smallest());

    }

    public static int greatest() {
        int max = ar[0];
        for (int i = 1; i < ar.length; i++) {
            if (ar[i] > max) {
                max = ar[i];
            }
        }
        return max;
    }

    public static int smallest(){
        int min = ar[0];
        for(int i =1; i<ar.length;i++){
            if(ar[i] <min){
                min = ar[i];
            }
        }

        return min;
    }

}
